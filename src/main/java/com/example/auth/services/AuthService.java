package com.example.auth.services;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.auth.dto.AuthDto;

public interface AuthService extends UserDetailsService {
    String getToken(AuthDto authDto);
    String validateToken(String token);
}
