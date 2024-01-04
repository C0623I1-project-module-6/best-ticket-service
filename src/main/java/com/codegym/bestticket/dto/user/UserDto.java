package com.codegym.bestticket.dto.user;

import com.codegym.bestticket.entity.user.Customer;
import com.codegym.bestticket.entity.user.Organizer;
import lombok.Data;

import java.util.UUID;

@Data
public class UserDto {
    private UUID id;
    private String username;
    private String password;
    private String email;
    private String avatar;
    private Customer customer;
    private Organizer organizer;
    private Boolean isDeleted;

}
