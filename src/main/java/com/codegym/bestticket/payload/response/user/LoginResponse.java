package com.codegym.bestticket.payload.response.user;

import com.codegym.bestticket.entity.user.Role;
import lombok.Data;

import java.util.Set;

@Data
public class LoginResponse {
    private String avatar;
    private String username;
    private String token;
    private Set<Role> listRole;

}
