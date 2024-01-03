package com.codegym.bestticket.converter.customer;

import com.codegym.bestticket.entity.user.customer.Customer;
import com.codegym.bestticket.payload.request.CustomerRequest;
import com.codegym.bestticket.payload.response.user.customer.CustomerResponse;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CustomerConverter {
    public CustomerResponse entityToDto(Customer customer) {
        CustomerResponse customerResponse = new CustomerResponse();
        BeanUtils.copyProperties(customer, customerResponse);
        return customerResponse;
    }

    public Customer dtoToEntity(CustomerRequest customerRequest) {
        Customer customer = new Customer();
        BeanUtils.copyProperties(customerRequest, customer);
        return customer;
    }

    public List<CustomerResponse> entitiesToDTOs(List<Customer> customers) {
        return customers.stream()
                .map(this::entityToDto)
                .collect(Collectors.toList());
    }
}
