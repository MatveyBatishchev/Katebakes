package com.example.katebakes.repos;

import com.example.katebakes.models.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    boolean existsUserByTelephone(String telephone);

}
