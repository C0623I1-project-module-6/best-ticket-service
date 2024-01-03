package com.codegym.bestticket.service;

import com.codegym.bestticket.dto.request.customer.CustomerRequestDTO;
import com.codegym.bestticket.dto.response.customer.CustomerResponseDTO;

import java.util.List;
import java.util.UUID;


public interface ICustomerService {
    CustomerResponseDTO create(CustomerRequestDTO customerRequestDTO);
    CustomerResponseDTO update (UUID id, CustomerRequestDTO customerRequestDTO);
    void remove(UUID id);
    void delete(UUID id);
    List<CustomerResponseDTO> findAll();
    CustomerResponseDTO findById(UUID id);

}
