package com.example.katebakes.controllers;

import com.example.katebakes.dto.ShoppingCartDto;
import com.example.katebakes.services.ShoppingCartService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ShoppingCartControllerImpl implements ShoppingCartController {

    private final ShoppingCartService shoppingCartService;

    @Override
    public ShoppingCartDto create(ShoppingCartDto shoppingCartDto) {
        return shoppingCartService.createShoppingCart(shoppingCartDto);
    }

}
