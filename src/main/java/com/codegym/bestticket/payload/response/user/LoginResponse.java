package com.codegym.bestticket.payload.response.user;

import com.codegym.bestticket.entity.user.Customer;
import com.codegym.bestticket.entity.user.Organizer;
import lombok.Data;

import java.util.Set;
import java.util.UUID;

@Data
public class LoginResponse {
    private UUID id;
    private String email;
    private String avatar;
    private String username;
    private String fullName;
    private String token;
    private Customer customer;
    private Organizer organizer;
    private Set<String> listRole;


}
