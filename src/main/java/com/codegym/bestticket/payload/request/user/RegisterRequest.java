package com.codegym.bestticket.payload.request.user;

import lombok.Data;

@Data
public class RegisterRequest {
    private String username;
    private String password;
    private String email;
    private String avatar;
}