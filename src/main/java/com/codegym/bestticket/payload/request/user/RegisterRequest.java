package com.codegym.bestticket.payload.request.user;

import lombok.Data;

import java.util.UUID;

@Data
public class RegisterRequest {
    private String username;
    private String password;
    private String phoneNumber;
    private String email;
    private UUID role;
}
