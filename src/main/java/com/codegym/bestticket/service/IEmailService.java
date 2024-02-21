package com.codegym.bestticket.service;

import com.codegym.bestticket.payload.request.SendValidationCodeRequest;

public interface IEmailService {
    void sendOtp(SendValidationCodeRequest sendValidationCodeRequest);
}
