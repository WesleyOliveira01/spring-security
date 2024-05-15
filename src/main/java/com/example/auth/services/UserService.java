package com.example.auth.services;

import java.util.List;

import com.example.auth.dto.UserDto;

public interface UserService {
    UserDto save(UserDto userDto);
    List<UserDto> getAll();
}
