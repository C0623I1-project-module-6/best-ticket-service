package com.codegym.bestticket.service;

import com.codegym.bestticket.dto.CustomerDTO;
import com.codegym.bestticket.dto.ResponseDto;
import com.codegym.bestticket.dto.response.user.CustomerDtoResponse;
import com.codegym.bestticket.entity.user.Customer;

import java.util.UUID;


public interface ICustomerService {
    CustomerDtoResponse create(CustomerDTO customerDTO);
    CustomerDtoResponse update(UUID id, CustomerDTO customerDTO);
    void remove(UUID id);

}
