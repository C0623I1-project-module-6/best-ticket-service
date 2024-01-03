package com.codegym.bestticket.dto.request.user;

import lombok.Data;

import java.util.UUID;

@Data
public class RegisterRequestDTO {
    private String username;
    private String password;
    private String phoneNumber;
    private String email;
    private UUID role;
}
