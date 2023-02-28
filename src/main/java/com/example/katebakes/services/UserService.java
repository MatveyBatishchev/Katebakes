package com.example.katebakes.services;

import com.example.katebakes.dto.UserDto;
import com.example.katebakes.errors.UserAlreadyExistsException;
import com.example.katebakes.mappers.UserMapper;
import com.example.katebakes.repos.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    private final PasswordEncoder passwordEncoder;

    private final UserMapper userMapper;

    public UserDto createUser(UserDto userDto) {
        if (userRepository.existsUserByTelephone(userDto.getTelephone())) {
            throw new UserAlreadyExistsException("There is already an account with that telephone number: " + userDto.getTelephone());
        }
        userDto.setPassword(passwordEncoder.encode(userDto.getPassword()));
        return userMapper.toDto(userRepository.save(userMapper.toUser(userDto)));
    }

}
