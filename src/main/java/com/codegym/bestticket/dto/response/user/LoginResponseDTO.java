package com.codegym.bestticket.dto.response.user;

import lombok.Data;

@Data
public class LoginResponseDTO {
    private String token;
    private String username;
    private String email;
    private String phoneNumber;


}
