package com.codegym.bestticket.payload.request;

import lombok.Data;

@Data
public class SendOtpRequest {
    private String to;
    private String otp;
}
