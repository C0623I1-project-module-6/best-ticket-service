package com.codegym.bestticket.service;

import com.codegym.bestticket.dto.ContractDTO;

import java.util.Optional;
import java.util.UUID;

public interface IContractService {
    Iterable<ContractDTO> findAll();

    Optional<ContractDTO> findById(UUID id);
    void save(ContractDTO contractDTO);
    void remove(UUID id);

    void update(ContractDTO contractDTO);
}
