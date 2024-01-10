package com.codegym.bestticket.payload.request.user;

import com.codegym.bestticket.entity.user.Role;
import lombok.Data;

import java.util.Set;

@Data
public class RegisterRequest {
    private String username;
    private String password;
    private String email;
    private String phoneNumber;
    private String avatar;
    private Set<String> listRole;
    private String confirmPassword;
}
