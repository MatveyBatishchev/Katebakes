package com.example.katebakes.services;

import com.example.katebakes.dto.ShoppingCartDto;
import com.example.katebakes.mappers.ShoppingCartMapper;
import com.example.katebakes.models.domain.ShoppingCart;
import com.example.katebakes.repos.ShoppingCartRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ShoppingCartService {

    private final ShoppingCartRepository shoppingCartRepository;

    private final ShoppingCartMapper shoppingCartMapper;

    public ShoppingCartDto createShoppingCart(ShoppingCartDto shoppingCartDto) {
        ShoppingCart shoppingCart = shoppingCartMapper.toShoppingCart(shoppingCartDto);
        return shoppingCartMapper.toDto(shoppingCartRepository.save(shoppingCart));
    }


}
