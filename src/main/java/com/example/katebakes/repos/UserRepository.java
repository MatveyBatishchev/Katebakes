package com.example.katebakes.repos;

import com.example.katebakes.models.domain.User;
import org.mapstruct.Named;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    @Override
    @NonNull
    @Named("getUserReferenceById")
    User getReferenceById(@NonNull Integer integer);

    boolean existsUserByTelephone(String telephone);

}
