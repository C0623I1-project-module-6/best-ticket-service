package com.codegym.bestticket.converter.user;

import com.codegym.bestticket.dto.response.EnterpriseRegisterResponse;
import com.codegym.bestticket.entity.user.Enterprise;
import com.codegym.bestticket.entity.user.Individual;
import com.codegym.bestticket.entity.user.User;
import org.springframework.stereotype.Component;

@Component
public class EnterpriseRegisterConverter {
    public EnterpriseRegisterResponse enterpriseRegisterToDto(User user,
                                                              Enterprise enterprise) {
        EnterpriseRegisterResponse enterpriseRegisterResponse = new EnterpriseRegisterResponse();
        enterpriseRegisterResponse.setId(enterprise.getId());
        enterpriseRegisterResponse.setUsername(user.getUsername());
        enterpriseRegisterResponse.setUser(enterprise.getUser().getId());
        return enterpriseRegisterResponse;
    }
}
