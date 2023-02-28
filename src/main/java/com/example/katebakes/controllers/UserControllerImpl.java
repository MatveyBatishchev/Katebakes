package com.example.katebakes.controllers;

import com.example.katebakes.dto.UserDto;
import com.example.katebakes.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserControllerImpl implements UserController {

    private final UserService userService;

    @Override
    public UserDto create(UserDto userDto) {
        return userService.createUser(userDto);
    }

    @Override
    public String test() {
        return "Hello world!";
    }
}

