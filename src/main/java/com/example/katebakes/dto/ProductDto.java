package com.example.katebakes.dto;

import com.example.katebakes.models.domain.Discount;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class ProductDto {

    private int id;

    private String name;

    private String description;

    private double price;

    private DiscountDto discountDto;

    private Set<CategoryDto> categoryDtoSet = new HashSet<>();

}
