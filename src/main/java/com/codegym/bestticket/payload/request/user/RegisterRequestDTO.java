package com.codegym.bestticket.payload.request.user;

import lombok.Data;

@Data
public class RegisterRequestDTO {
    private String username;
    private String password;
    private String phoneNumber;
    private String email;
}
