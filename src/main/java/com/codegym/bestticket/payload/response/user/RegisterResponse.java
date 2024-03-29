package com.codegym.bestticket.payload.response.user;

import com.codegym.bestticket.entity.user.Role;
import lombok.Data;

import java.util.Set;
import java.util.UUID;

@Data
public class RegisterResponse {
    private UUID id;
    private String username;
    private String email;
    private String phoneNumber;
    private String avatar;
    private Set<String> listRole;
}
