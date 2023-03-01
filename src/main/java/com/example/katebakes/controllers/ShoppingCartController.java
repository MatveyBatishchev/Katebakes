package com.example.katebakes.controllers;

import com.example.katebakes.dto.ShoppingCartDto;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Tag(name="Shopping cart")
@RequestMapping("/cart")
public interface ShoppingCartController {

    @PostMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    ShoppingCartDto create(ShoppingCartDto shoppingCartDto);


}
