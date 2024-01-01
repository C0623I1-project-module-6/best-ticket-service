package com.codegym.bestticket.dto.request.user;

import lombok.Data;

@Data
public class LoginDtoRequest {
    private String phoneNumber;
    private String password;
}
