package com.codegym.bestticket.service;

import com.codegym.bestticket.dto.CustomerDTO;
import com.codegym.bestticket.dto.response.user.CustomerDtoResponse;

import java.util.List;
import java.util.UUID;


public interface ICustomerService {
    CustomerDtoResponse create(CustomerDTO customerDTO);
    CustomerDtoResponse update ( UUID id, CustomerDTO customerDTO);
    void remove(UUID id);
    List<CustomerDtoResponse> findAll();
    CustomerDtoResponse findById(UUID id);

}
