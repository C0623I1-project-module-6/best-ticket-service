package com.codegym.bestticket.dto;

import com.codegym.bestticket.entity.user.User;
import lombok.Data;

import java.util.UUID;

@Data
public class UserDTO {
    private String password;
    private String phoneNumber;
    private String email;
    private Boolean isDelete;
}
