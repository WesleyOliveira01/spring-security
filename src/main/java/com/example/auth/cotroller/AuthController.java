package com.example.auth.cotroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.auth.dto.AuthDto;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    AuthenticationManager authenticationManager;

    @PostMapping
    public String login(@RequestBody AuthDto authDto) {
        var userToken = new UsernamePasswordAuthenticationToken(authDto.login(), authDto.password());
        var token = authenticationManager.authenticate(userToken);
        return "login efetuado...";
    }

}
