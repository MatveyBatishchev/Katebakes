package com.example.katebakes.dto;

import lombok.Data;

@Data
public class CartItemDto {

    private int id;
    private double quantity;
    private ProductDto productDto;
    private int shoppingCartId;

}
