package com.codegym.bestticket.payload.request.user;

import lombok.Data;

@Data
public class LoginRequestDTO {
    private String email;
    private String phoneNumber;
    private String password;
}
