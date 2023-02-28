package com.example.katebakes.mappers;

import com.example.katebakes.dto.UserDto;
import com.example.katebakes.models.domain.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", config = IgnoreUnmappedMapperConfig.class)
public interface UserMapper {

    UserDto toDto(User user);

    @Mapping(target = "id", ignore = true) // during creating id will generate automatically
    User toUser(UserDto userDto);

}
