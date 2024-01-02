package com.codegym.bestticket.converter.customer;
import com.codegym.bestticket.dto.CustomerDTO;
import com.codegym.bestticket.dto.response.customer.CustomerDtoResponse;
import com.codegym.bestticket.entity.customer.Customer;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CustomerConverter {
    public CustomerDtoResponse entityToDto(Customer customer) {
        CustomerDtoResponse customerDtoResponse = new CustomerDtoResponse();
        BeanUtils.copyProperties(customer, customerDtoResponse);
        return customerDtoResponse;
    }

    public Customer dtoToEntity(CustomerDTO customerDTO) {
        Customer customer = new Customer();
        BeanUtils.copyProperties(customerDTO, customer);
        return customer;
    }

    public List<CustomerDtoResponse> entitiesToDTOs(List<Customer> customers) {
        return customers.stream()
                .map(this::entityToDto)
                .collect(Collectors.toList());
    }
}
