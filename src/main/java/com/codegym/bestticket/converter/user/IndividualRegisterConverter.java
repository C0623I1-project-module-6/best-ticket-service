package com.codegym.bestticket.converter.user;

import com.codegym.bestticket.dto.response.IndividualRegisterResponse;
import com.codegym.bestticket.entity.user.Individual;
import com.codegym.bestticket.entity.user.User;

public class IndividualRegisterConverter {
    public IndividualRegisterResponse individualRegisterToDto(User user, Individual individual) {
        IndividualRegisterResponse individualRegisterResponse = new IndividualRegisterResponse();
        individualRegisterResponse.setId(individual.getId());
        individualRegisterResponse.setUsername(user.getUsername());
        individualRegisterResponse.setUser(individual.getUser().getId());
        return individualRegisterResponse;
    }
}
