package com.codegym.bestticket.service;

import com.codegym.bestticket.payload.request.contract.ContractDetailRequestDTO;
import com.codegym.bestticket.payload.response.contract.ContractDetailResponseDTO;

import java.util.Optional;
import java.util.UUID;

public interface IContractDetailService {
    Iterable<ContractDetailResponseDTO> findAll();
    Optional<ContractDetailResponseDTO> findById(UUID id);
    Iterable<ContractDetailResponseDTO> findAllByContractId(UUID contractId);
    Optional<ContractDetailResponseDTO> findByContractIdAndId(UUID contractId, UUID id);
    void save(ContractDetailRequestDTO contractDetailRequestDTO);
    void remove(UUID id);
    void delete(UUID id);
}
