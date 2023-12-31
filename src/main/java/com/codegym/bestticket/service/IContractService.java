package com.codegym.bestticket.service;

import com.codegym.bestticket.dto.request.contract.ContractRequestDTO;
import com.codegym.bestticket.dto.response.contract.ContractResponseDTO;

import java.util.Optional;
import java.util.UUID;

public interface IContractService {
    Iterable<ContractResponseDTO> findAll();
    Optional<ContractResponseDTO> findById(UUID id);
    void save(ContractRequestDTO contractRequestDTO);
    void remove(UUID id);
    void delete(UUID id);
}
