package com.codegym.bestticket.service;

import com.codegym.bestticket.payload.request.contract.ContractRequest;
import com.codegym.bestticket.payload.response.contract.ContractResponse;
import com.codegym.bestticket.entity.user.customer.Customer;
import com.codegym.bestticket.entity.user.organizer.Organizer;

import java.util.Optional;
import java.util.UUID;

public interface IContractService {
    Iterable<ContractResponse> findAll();

    Optional<ContractResponse> findById(UUID id);

    void save(ContractRequest contractRequest);

    void remove(UUID id);

    void delete(UUID id);

    Iterable<ContractResponse> searchAllByCustomer(Customer customer);

    Iterable<ContractResponse> searchAllByOrganizer(Organizer organizer);

    Iterable<ContractResponse> searchByInput(String input);
}
