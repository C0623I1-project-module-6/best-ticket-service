package com.codegym.bestticket.dto.response.user;

import lombok.Data;

@Data
public class LoginDtoResponse {
    private String token;
    private String phoneNumber;
    private String email;

}
