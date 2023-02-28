package com.example.katebakes.controllers;

import com.example.katebakes.dto.UserDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/users")
public interface UserController {

    @PostMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    UserDto create(@RequestBody UserDto userDto);

    @GetMapping("/hello")
    @ResponseStatus(HttpStatus.OK)
    String test();

}
