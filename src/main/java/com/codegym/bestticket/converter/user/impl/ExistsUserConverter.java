package com.codegym.bestticket.converter.user.impl;

import com.codegym.bestticket.converter.user.IExistsUserConverter;
import com.codegym.bestticket.entity.user.Customer;
import com.codegym.bestticket.entity.user.Organizer;
import com.codegym.bestticket.entity.user.User;
import com.codegym.bestticket.payload.response.user.ExistsUserResponse;
import com.codegym.bestticket.repository.user.ICustomerRepository;
import com.codegym.bestticket.repository.user.IOrganizerRepository;
import com.codegym.bestticket.repository.user.IUserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@AllArgsConstructor
public class ExistsUserConverter implements IExistsUserConverter {
    private final IUserRepository userRepository;
    private final ICustomerRepository customerRepository;
    private final IOrganizerRepository organizerRepository;

    @Override
    public ExistsUserResponse mapToExistsUsers(User user) {
        ExistsUserResponse existsUserResponse = new ExistsUserResponse();
        existsUserResponse.setUsername(user.getUsername());
        existsUserResponse.setUserEmail(user.getEmail());
        BeanUtils.copyProperties(user, existsUserResponse);
        Optional<Customer> customer = customerRepository.findByUserIdAndIsDeletedFalse(user.getId());
        if (customer.isPresent()) {
            existsUserResponse.setCustomerPhoneNumber(customer.get().getPhoneNumber());
            existsUserResponse.setCustomerIdCard(customer.get().getIdCard());
            existsUserResponse.setCustomerReceiptEmail(customer.get().getReceiptEmail());
        }
        Optional<Organizer> organizer = organizerRepository.findByUserIdAndIsDeletedFalse(user.getId());
        if (organizer.isPresent()) {
            existsUserResponse.setPersonEmail(organizer.get().getEmail());
            existsUserResponse.setPersonPhoneNumber(organizer.get().getPhoneNumber());
            existsUserResponse.setPersonIdCard(organizer.get().getIdCard());
            existsUserResponse.setPersonTaxCode(organizer.get().getTaxCode());
            existsUserResponse.setCompanyBusinessCode(organizer.get().getBusinessCode());
            existsUserResponse.setCompanyName(organizer.get().getCompanyName());
            existsUserResponse.setCompanyEmail(organizer.get().getCompanyEmail());
            existsUserResponse.setCompanyPhone(organizer.get().getCompanyPhone());
        }
        return existsUserResponse;
    }
}
