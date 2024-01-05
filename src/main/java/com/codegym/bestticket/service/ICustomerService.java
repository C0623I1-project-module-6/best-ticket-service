package com.codegym.bestticket.service;

import com.codegym.bestticket.dto.user.CustomerDto;
import com.codegym.bestticket.payload.ResponsePayload;
import com.codegym.bestticket.payload.request.user.CustomerRequest;
import org.springframework.data.domain.Pageable;

import java.util.UUID;


public interface ICustomerService {
    ResponsePayload addInfo(UUID id, CustomerRequest customerRequest);

    ResponsePayload update(UUID id, CustomerDto customerDto);

    ResponsePayload findAll(Pageable pageable);

    ResponsePayload findById(UUID id);

}
