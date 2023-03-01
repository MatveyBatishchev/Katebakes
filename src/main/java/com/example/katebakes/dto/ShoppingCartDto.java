package com.example.katebakes.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class ShoppingCartDto {

    private int id;

    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private double total;

    private int userId;

    private Set<CartItemDto> cartItemDtoSet = new HashSet<>();

}
