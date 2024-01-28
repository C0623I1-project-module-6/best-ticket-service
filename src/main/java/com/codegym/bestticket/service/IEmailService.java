package com.codegym.bestticket.service;

import com.codegym.bestticket.payload.request.SendOtpRequest;

public interface IEmailService {
    void sendOtp(SendOtpRequest sendOtpRequest);
}
