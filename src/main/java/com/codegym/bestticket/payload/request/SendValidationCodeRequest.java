package com.codegym.bestticket.payload.request;

import lombok.Data;

@Data
public class SendValidationCodeRequest {
    private String to;
    private String validationCode;
}
