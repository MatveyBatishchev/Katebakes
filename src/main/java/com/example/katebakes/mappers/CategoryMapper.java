package com.example.katebakes.mappers;

import com.example.katebakes.dto.CategoryDto;
import com.example.katebakes.models.domain.Category;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

import java.util.Set;

@Mapper(componentModel = "spring", config = IgnoreUnmappedMapperConfig.class)
public interface CategoryMapper {

    @Named("toCategory")
    Category toCategory(CategoryDto categoryDto);

    @Named("toCategoryDto")
    CategoryDto toDto(Category category);

    @Named("mapToCategoryDto")
    @IterableMapping(qualifiedByName = "toCategoryDto")
    Set<CategoryDto> mapToDto(Set<Category> categories);

}
