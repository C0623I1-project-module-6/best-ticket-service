package com.codegym.bestticket.payload.request;

import lombok.Data;

@Data
public class VerifyValidationCodeRequest {
    private String email;
    private String validationCode;
    private String newPassword;
    private String confirmNewPassword;
}
