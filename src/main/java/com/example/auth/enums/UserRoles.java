package com.example.auth.enums;

import lombok.Getter;

@Getter
public enum UserRoles {
    ADMIN("admin"),
    USER("user");

    String role;

    UserRoles(String role) {
        this.role = role;
    }
}
