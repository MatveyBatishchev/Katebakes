package com.example.katebakes.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class UserDto {
    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private int id;

    private String username;

    private String password;

    private String firstName;

    private String lastName;

    private String telephone;

}
