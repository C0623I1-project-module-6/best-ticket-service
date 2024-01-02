package com.codegym.bestticket.dto.response.user;

import lombok.Data;

@Data
public class LoginDtoResponse {
    private String token;
    private String username;
    private String email;
    private String phoneNumber;


}
