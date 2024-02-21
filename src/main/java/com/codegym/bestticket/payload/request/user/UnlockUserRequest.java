package com.codegym.bestticket.payload.request.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UnlockUserRequest {
    @NotBlank
    @Email
    private String email;
    @NotBlank
    private String validationCode;
}
