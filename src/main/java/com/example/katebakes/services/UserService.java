package com.example.katebakes.services;

import com.example.katebakes.dto.UserDto;
import com.example.katebakes.mappers.UserMapper;
import com.example.katebakes.models.domain.User;
import com.example.katebakes.repos.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    private final UserMapper userMapper;

    public UserDto createUser(UserDto userDto) {
        User user = userMapper.toUser(userDto);
        System.out.println(user);
        return userMapper.toDto(userRepository.save(user));
    }

}
