package com.codegym.bestticket.payload.request.user;

import com.codegym.bestticket.entity.user.Role;
import com.codegym.bestticket.validation.UniqueCustomer;
import com.codegym.bestticket.validation.UniqueUser;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.Set;

@Data
public class RegisterRequest {
    @NotBlank(message = "Username is mandatory!")
    @UniqueUser
    private String username;
    @NotBlank(message = "Password is mandatory!")
    @Size(min =6, message = "Password must be at least 6 characters long!")
    @Pattern(regexp = ".*[a-zA-z].*", message = "Password must contain at least one letter!")
    private String password;
    @NotBlank(message = "Email is mandatory!")
    @Email(message = "Invalid email format!")
    @UniqueUser
    private String email;
    @UniqueCustomer
    private String phoneNumber;
    private String avatar;
    private Set<String> listRole;
    @NotBlank(message = "Confirm password is mandatory!")
    @Size(min =6, message = "Confirm password must be at least 6 characters long!")
    @Pattern(regexp = ".*[a-zA-z].*", message = "Confirm password must contain at least one letter!")
    private String confirmPassword;
}
