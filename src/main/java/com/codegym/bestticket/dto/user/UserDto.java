package com.codegym.bestticket.dto.user;

import com.codegym.bestticket.entity.user.Customer;
import com.codegym.bestticket.entity.user.Organizer;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.Set;
import java.util.UUID;

@Data
public class UserDto {
    private UUID id;
    @NotBlank(message = "Username is mandatory!")
    private String username;
    @NotBlank(message = "Password is mandatory!")
    @Size(min = 6, message = "Password must be at least 6 characters long!")
    @Pattern(regexp = ".*[a-zA-z].*", message = "Password must contain at least one letter!")
    private String password;
    @NotBlank(message = "Username is mandatory!")
    @Email(message = "Invalid email format!")
    private String email;
    private String avatar;
    private Set<String> listRoles;
    private String customerPhoneNumber;
    private Organizer organizer;
    private Customer customer;
    private Boolean isDeleted;

}
