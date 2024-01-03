package com.codegym.bestticket.dto.response.user;

import com.codegym.bestticket.entity.user.Role;
import lombok.Data;

import java.util.UUID;

@Data
public class RegisterResponseDTO {
    private UUID id;
    private String username;
    private String email;
    private String phoneNumber;
    private Role role;

}
