package com.codegym.bestticket.payload.request.user;

import lombok.Data;

@Data
public class TokenRefreshRequest {
    private String refreshToken;

}
