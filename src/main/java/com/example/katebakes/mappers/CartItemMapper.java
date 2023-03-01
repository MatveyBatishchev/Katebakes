package com.example.katebakes.mappers;

import com.example.katebakes.dto.CartItemDto;
import com.example.katebakes.models.domain.CartItem;
import com.example.katebakes.repos.ShoppingCartRepository;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import java.util.Set;

@Mapper(componentModel = "spring", config = IgnoreUnmappedMapperConfig.class,
        uses = {ShoppingCartRepository.class, ProductMapper.class})
public interface CartItemMapper {

    @Mapping(target="shoppingCart", source="shoppingCartId", qualifiedByName = "getShoppingCartReferenceById")
    @Mapping(target="product", source="productDto", qualifiedByName = "toProduct")
    CartItem toCartItem(CartItemDto cartItemDto);

    @Named("toCartItemDto")
    @Mapping(target="shoppingCartId", expression = "java(cartItem.getShoppingCart().getId())")
    @Mapping(target="productDto", source="product", qualifiedByName = "toProductDto")
    CartItemDto toDto(CartItem cartItem);

    @Named("mapCartItemToDto")
    @IterableMapping(qualifiedByName = "toCartItemDto")
    Set<CartItemDto> mapToDto(Set<CartItem> cartItems);

}
