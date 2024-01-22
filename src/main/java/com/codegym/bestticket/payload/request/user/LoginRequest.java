package com.codegym.bestticket.payload.request.user;

import com.codegym.bestticket.entity.user.Customer;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class LoginRequest {
    @NotBlank(message = "Username is mandatory!")
    private String username;
    @NotBlank(message = "Password is mandatory!")
    @Size(min =6, message = "Password must be at least 6 characters long!")
    @Pattern(regexp = ".*[a-zA-z].*", message = "Password must contain at least one letter!")
    private String password;

}
