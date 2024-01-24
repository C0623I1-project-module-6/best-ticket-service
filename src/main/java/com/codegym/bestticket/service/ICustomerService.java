package com.codegym.bestticket.service;

import com.codegym.bestticket.dto.user.CustomerDto;
import com.codegym.bestticket.payload.ResponsePayload;


public interface ICustomerService {
    ResponsePayload create(CustomerDto customerDto);

    ResponsePayload update(CustomerDto customerDto);


}
