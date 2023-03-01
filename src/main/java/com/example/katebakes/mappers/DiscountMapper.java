package com.example.katebakes.mappers;

import com.example.katebakes.dto.DiscountDto;
import com.example.katebakes.models.domain.Discount;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

@Mapper(componentModel = "spring", config = IgnoreUnmappedMapperConfig.class)
public interface DiscountMapper {

    @Named("toDiscount")
    Discount toDiscount(DiscountDto discountDto);

    @Named("toDiscountDto")
    DiscountDto toDto(Discount discount);

}
