package com.codegym.bestticket.service.impl;

import com.codegym.bestticket.payload.request.SendOtpRequest;
import com.codegym.bestticket.service.IEmailService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService implements IEmailService {
    @Value("${spring.mail.username}")
    private String emailForm;

    private final JavaMailSender javaMailSender;

    public EmailService(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    @Override
    public void sendOtp(SendOtpRequest sendOtpRequest) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(emailForm);
        message.setTo(sendOtpRequest.getTo());
        message.setSubject("Your OTP code.");
        message.setText("Your OTP code is:" + sendOtpRequest.getOtp());
        javaMailSender.send(message);
    }
}
