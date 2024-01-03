package com.codegym.bestticket.service;

import com.codegym.bestticket.dto.request.contract.ContractRequestDTO;
import com.codegym.bestticket.dto.response.contract.ContractResponseDTO;
import com.codegym.bestticket.entity.customer.Customer;
import com.codegym.bestticket.entity.organizer.Organizer;

import java.util.Optional;
import java.util.UUID;

public interface IContractService {
    Iterable<ContractResponseDTO> findAll();

    Optional<ContractResponseDTO> findById(UUID id);

    void save(ContractRequestDTO contractRequestDTO);

    void remove(UUID id);

    void delete(UUID id);

    Iterable<ContractResponseDTO> searchAllByCustomer(Customer customer);

    Iterable<ContractResponseDTO> searchAllByOrganizer(Organizer organizer);

    Iterable<ContractResponseDTO> searchByInput(String input);
}
