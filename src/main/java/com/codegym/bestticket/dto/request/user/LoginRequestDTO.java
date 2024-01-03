package com.codegym.bestticket.dto.request.user;

import lombok.Data;

@Data
public class LoginRequestDTO {
    private String email;
    private String phoneNumber;
    private String password;
}
