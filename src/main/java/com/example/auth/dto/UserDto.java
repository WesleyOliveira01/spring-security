package com.example.auth.dto;

import com.example.auth.models.User;

public record UserDto(
        String name,
        String login,
        String password) {

    public UserDto(User user) {
        this(user.getName(), user.getLogin(), user.getPassword());
    }
}
