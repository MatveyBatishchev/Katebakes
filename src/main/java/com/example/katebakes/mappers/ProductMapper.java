package com.example.katebakes.mappers;

import com.example.katebakes.dto.ProductDto;
import com.example.katebakes.models.domain.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "spring", config = IgnoreUnmappedMapperConfig.class,
        uses = {DiscountMapper.class, CategoryMapper.class})
public interface ProductMapper {

    @Named("toProduct")
    @Mapping(target = "discount", source = "discountDto", qualifiedByName="toDiscount")
    Product toProduct(ProductDto productDto);

    @Named("toProductDto")
    @Mapping(target = "discountDto", source = "discount", qualifiedByName="toDiscountDto")
    @Mapping(target = "categoryDtoSet", source = "categories", qualifiedByName="mapToCategoryDto")
    ProductDto toDto(Product product);

}
