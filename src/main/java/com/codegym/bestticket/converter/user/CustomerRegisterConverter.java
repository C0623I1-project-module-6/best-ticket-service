package com.codegym.bestticket.converter.user;

import com.codegym.bestticket.dto.response.CustomerRegisterResponse;
import com.codegym.bestticket.entity.user.Customer;
import com.codegym.bestticket.entity.user.User;
import org.springframework.stereotype.Component;

@Component
public class CustomerRegisterConverter {
    public CustomerRegisterResponse customerRegisterToDto(User user, Customer customer) {
        CustomerRegisterResponse customerRegisterResponse = new CustomerRegisterResponse();
        customerRegisterResponse.setId(customer.getId());
        customerRegisterResponse.setUsername(user.getUsername());
        customerRegisterResponse.setPhoneNumber(customer.getPhoneNumber());
        customerRegisterResponse.setEmail(customer.getEmail());
        customerRegisterResponse.setUser(customer.getUser().getId());
        return customerRegisterResponse;
    }
}
