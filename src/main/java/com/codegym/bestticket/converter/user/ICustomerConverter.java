package com.codegym.bestticket.converter.user;

import com.codegym.bestticket.entity.user.Customer;
import com.codegym.bestticket.payload.request.customer.CustomerRequestDTO;
import com.codegym.bestticket.payload.response.customer.CustomerResponseDTO;

import java.util.List;

public interface ICustomerConverter {
    CustomerResponseDTO entityToDto(Customer customer);
    Customer dtoToEntity(CustomerRequestDTO customerRequestDTO);
    List<CustomerResponseDTO> entitiesToDTOs(List<Customer> customers);
}
