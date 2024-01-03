package com.codegym.bestticket.converter.user;

import com.codegym.bestticket.entity.user.Customer;
import com.codegym.bestticket.payload.request.user.CustomerRequest;
import com.codegym.bestticket.payload.response.user.CustomerResponse;

import java.util.List;

public interface ICustomerConverter {
    CustomerResponse entityToDto(Customer customer);

    Customer dtoToEntity(CustomerRequest customerRequest);

    List<CustomerResponse> entitiesToDTOs(List<Customer> customers);
}
