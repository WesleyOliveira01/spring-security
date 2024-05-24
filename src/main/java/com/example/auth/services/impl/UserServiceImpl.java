package com.example.auth.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.auth.dto.UserDto;
import com.example.auth.models.User;
import com.example.auth.repositories.UserRepository;
import com.example.auth.services.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public UserDto save(UserDto userDto) {
        var hasPassword = passwordEncoder.encode(userDto.password());
        User user = new User(userDto);
        user.setPassword(hasPassword);
        userRepository.save(user);
        return new UserDto(user);
    }

    @Override
    public List<UserDto> getAll() {
        try {
            List<User> users = userRepository.findAll();
            return users.stream().map(UserDto::new).toList();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

}
