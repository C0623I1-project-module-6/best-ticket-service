package com.codegym.bestticket.payload.response.user;

import com.codegym.bestticket.entity.user.Role;
import lombok.Data;

import java.util.UUID;

@Data
public class RegisterResponse {
    private UUID id;
    private String username;
    private String email;
    private String avatar;
    private Role role;

}
