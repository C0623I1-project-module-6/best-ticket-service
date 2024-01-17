package com.codegym.bestticket.service.impl.user;

import com.codegym.bestticket.security.JwtTokenProvider;
import com.codegym.bestticket.service.ISecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class SecurityService implements ISecurityService {
    @Autowired
    private JwtTokenProvider jwtTokenProvider;

    public SecurityService(JwtTokenProvider jwtTokenProvider) {
        this.jwtTokenProvider = jwtTokenProvider;
    }

    @Override
    public boolean isAuthenticated() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication == null
                || AnonymousAuthenticationToken.class.isAssignableFrom(authentication.getClass())) {
            return false;
        }
        return authentication.isAuthenticated();
    }

    @Override
    public boolean isValidToken(String authToken)  {
        String jwt = jwtTokenProvider.getJwtFromBearerToken(authToken);
        try {
            if (StringUtils.hasText(jwt) && jwtTokenProvider.validateToken(authToken)) {
                return true;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return false;
    }
}
