package com.example.auth.dto;

import com.example.auth.enums.UserRoles;
import com.example.auth.models.User;

public record UserDto(
        String name,
        String login,
        String password,
        UserRoles role) {

    public UserDto(User user) {
        this(user.getName(), user.getLogin(), user.getPassword(), user.getRole());
    }
}
