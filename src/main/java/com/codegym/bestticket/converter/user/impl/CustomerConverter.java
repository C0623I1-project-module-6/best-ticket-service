package com.codegym.bestticket.converter.user.impl;
import com.codegym.bestticket.dto.request.customer.CustomerRequestDTO;
import com.codegym.bestticket.dto.response.customer.CustomerResponseDTO;
import com.codegym.bestticket.entity.customer.Customer;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CustomerConverter {
    public CustomerResponseDTO entityToDto(Customer customer) {
        CustomerResponseDTO customerResponseDTO = new CustomerResponseDTO();
        BeanUtils.copyProperties(customer, customerResponseDTO);
        return customerResponseDTO;
    }

    public Customer dtoToEntity(CustomerRequestDTO customerRequestDTO) {
        Customer customer = new Customer();
        BeanUtils.copyProperties(customerRequestDTO, customer);
        return customer;
    }

    public List<CustomerResponseDTO> entitiesToDTOs(List<Customer> customers) {
        return customers.stream()
                .map(this::entityToDto)
                .collect(Collectors.toList());
    }
}
