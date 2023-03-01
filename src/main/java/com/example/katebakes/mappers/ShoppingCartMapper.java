package com.example.katebakes.mappers;

import com.example.katebakes.dto.ShoppingCartDto;
import com.example.katebakes.models.domain.ShoppingCart;
import com.example.katebakes.repos.UserRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", config = IgnoreUnmappedMapperConfig.class,
        uses = {UserRepository.class, CartItemMapper.class})
public interface ShoppingCartMapper {

    // Should i insert cartItems mapping?
    @Mapping(target="user", source="userId", qualifiedByName = "getUserReferenceById")
    ShoppingCart toShoppingCart(ShoppingCartDto shoppingCartDto);

    @Mapping(target="userId", expression = "java(shoppingCart.getUser().getId())")
    @Mapping(target="cartItemDtoSet", source="cartItems", qualifiedByName = "mapCartItemToDto")
    ShoppingCartDto toDto(ShoppingCart shoppingCart);

}
