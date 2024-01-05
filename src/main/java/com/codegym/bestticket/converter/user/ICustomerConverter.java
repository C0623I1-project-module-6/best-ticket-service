package com.codegym.bestticket.converter.user;

import com.codegym.bestticket.dto.user.CustomerDto;
import com.codegym.bestticket.entity.user.Customer;
import com.codegym.bestticket.payload.response.user.CustomerResponse;

import java.util.List;

public interface ICustomerConverter {
    CustomerResponse entityToDto(Customer customer);

    Customer dtoToEntity(CustomerDto customerDto);

    List<CustomerResponse> entitiesToDtos(List<Customer> customers);
}
