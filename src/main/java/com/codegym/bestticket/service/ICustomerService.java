package com.codegym.bestticket.service;

import com.codegym.bestticket.dto.user.CustomerDto;
import com.codegym.bestticket.payload.ResponsePayload;

import java.util.UUID;


public interface ICustomerService {
    ResponsePayload create(CustomerDto customerDto);

    ResponsePayload update(UUID id, CustomerDto customerDto);

    ResponsePayload findAll();

    ResponsePayload findById(UUID id);

}
