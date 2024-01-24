package com.codegym.bestticket.payload.request.user;

import lombok.Data;

@Data
public class LoginGoogleRequest {
    private String clientId;
    private String credential;
    private String selectBy;
}
