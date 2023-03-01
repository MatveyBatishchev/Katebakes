package com.example.katebakes.repos;

import com.example.katebakes.models.domain.ShoppingCart;
import org.mapstruct.Named;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Integer> {

    @Override
    @NonNull
    @Named("getShoppingCartReferenceById")
    ShoppingCart getReferenceById(@NonNull Integer integer);

}
