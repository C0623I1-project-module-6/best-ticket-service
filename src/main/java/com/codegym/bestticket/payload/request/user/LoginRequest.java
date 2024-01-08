package com.codegym.bestticket.payload.request.user;

import com.codegym.bestticket.entity.user.Customer;
import lombok.Data;

@Data
public class LoginRequest {
    private String input;
    private String password;

}
