package com.codegym.bestticket.service;

import com.codegym.bestticket.dto.user.CustomerDto;
import com.codegym.bestticket.payload.ResponsePayload;
import org.springframework.data.domain.Pageable;

import java.util.UUID;


public interface ICustomerService {
    ResponsePayload addInfo(CustomerDto request);

    ResponsePayload update(UUID id, CustomerDto request);

    ResponsePayload findAll(Pageable pageable);

    ResponsePayload findById(UUID id);

}
