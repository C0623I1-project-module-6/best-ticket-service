package com.codegym.bestticket.service;

public interface ISecurityService {
    boolean isAuthenticated();

    boolean isValidToken(String token);
}
