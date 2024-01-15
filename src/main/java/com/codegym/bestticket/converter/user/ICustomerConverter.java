package com.codegym.bestticket.converter.user;

import com.codegym.bestticket.dto.user.CustomerDto;
import com.codegym.bestticket.entity.user.Customer;

import java.util.List;

public interface ICustomerConverter {
    CustomerDto entityToDto(Customer customer);

    Customer dtoToEntity(CustomerDto customerDto);

    List<CustomerDto> entitiesToDtos(List<Customer> customers);
}
