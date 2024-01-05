package com.codegym.bestticket.payload.response.user;

import lombok.Data;

@Data
public class LoginResponse {
    private String token;
    private String username;
    private String email;



}
