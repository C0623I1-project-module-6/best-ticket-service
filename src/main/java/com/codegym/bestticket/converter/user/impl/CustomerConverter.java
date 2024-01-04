package com.codegym.bestticket.converter.user.impl;

import com.codegym.bestticket.converter.user.ICustomerConverter;
import com.codegym.bestticket.dto.user.CustomerDto;
import com.codegym.bestticket.entity.user.Customer;
import com.codegym.bestticket.payload.response.user.CustomerResponse;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component

public class CustomerConverter implements ICustomerConverter {
    public CustomerResponse entityToDto(Customer customer) {
        CustomerResponse customerResponse = new CustomerResponse();
        BeanUtils.copyProperties(customer, customerResponse);
        return customerResponse;

    }

    public Customer dtoToEntity(CustomerDto customerDto) {
        Customer customer = new Customer();
        BeanUtils.copyProperties(customerDto, customer);
        return customer;
    }

    public List<CustomerResponse> entitiesToDTOs(List<Customer> customers) {
        return customers.stream()
                .map(this::entityToDto)
                .collect(Collectors.toList());
    }
}
