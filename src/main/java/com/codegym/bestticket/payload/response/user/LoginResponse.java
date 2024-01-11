package com.codegym.bestticket.payload.response.user;

import com.codegym.bestticket.entity.user.Role;
import lombok.Data;

import java.util.Set;
import java.util.UUID;

@Data
public class LoginResponse {
    private String avatar;
    private String username;
    private String fullName;
    private String token;
    private String type = "Bearer ";
    private String refreshToken;
    private UUID id;
    private String email;
    private Set<String> listRole;

}
