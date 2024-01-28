package com.codegym.bestticket.payload.request;

import lombok.Data;

@Data
public class VerifyOtpRequest {
    private String email;
    private String otp;
    private String newPassword;
    private String confirmNewPassword;
}
