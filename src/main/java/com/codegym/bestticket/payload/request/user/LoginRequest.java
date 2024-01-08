package com.codegym.bestticket.payload.request.user;

import com.codegym.bestticket.entity.user.Customer;
import lombok.Data;

@Data
public class LoginRequest {
    private String email;
    private String username;
    private String phoneNumber;
    private String password;

}
