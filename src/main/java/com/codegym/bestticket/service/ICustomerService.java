package com.codegym.bestticket.service;

import com.codegym.bestticket.payload.request.CustomerRequest;
import com.codegym.bestticket.payload.response.user.customer.CustomerResponse;

import java.util.List;
import java.util.UUID;


public interface ICustomerService {
    CustomerResponse create(CustomerRequest customerRequest);
    CustomerResponse update (UUID id, CustomerRequest customerRequest);
    void remove(UUID id);
    void delete(UUID id);
    List<CustomerResponse> findAll();
    CustomerResponse findById(UUID id);

}
