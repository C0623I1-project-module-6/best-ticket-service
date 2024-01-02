package com.codegym.bestticket.dto.request.user;

import lombok.Data;

@Data
public class RegisterDtoRequest {
    private String password;
    private String phoneNumber;
    private String email;
}
