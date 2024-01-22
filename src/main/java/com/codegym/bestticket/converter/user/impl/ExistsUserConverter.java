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

import java.util.Collections;
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
        existsUserResponse.setUsernames(Collections.singletonList(user.getUsername()));
        existsUserResponse.setUserEmails(Collections.singletonList(user.getEmail()));
        BeanUtils.copyProperties(user, existsUserResponse);
        Optional<Customer> customer = customerRepository.findByUserIdAndIsDeletedFalse(user.getId());
        if (customer.isPresent()) {
            existsUserResponse.setCustomerPhoneNumbers(Collections.singletonList(customer.get().getPhoneNumber()));
            existsUserResponse.setCustomerIdCards(Collections.singletonList(customer.get().getIdCard()));
        }
        Optional<Organizer> organizer = organizerRepository.findByUserIdAndIsDeletedFalse(user.getId());
        if (organizer.isPresent()) {
            existsUserResponse.setOrganizerEmails(Collections.singletonList(organizer.get().getEmail()));
            existsUserResponse.setOrganizerPhoneNumbers(Collections.singletonList(organizer.get().getPhoneNumber()));
            existsUserResponse.setOrganizerIdCards(Collections.singletonList(organizer.get().getIdCard()));
            existsUserResponse.setOrganizerTaxCodes(Collections.singletonList(organizer.get().getTaxCode()));
            existsUserResponse.setOrganizerBusinessCodes(Collections.singletonList(organizer.get().getBusinessCode()));
        }
        return existsUserResponse;
    }
}
