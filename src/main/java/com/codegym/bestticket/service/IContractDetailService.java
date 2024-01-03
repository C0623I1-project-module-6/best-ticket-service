package com.codegym.bestticket.service;

import com.codegym.bestticket.payload.request.contract.ContractDetailRequest;
import com.codegym.bestticket.payload.response.contract.ContractDetailResponse;

import java.util.Optional;
import java.util.UUID;

public interface IContractDetailService {
    Iterable<ContractDetailResponse> findAll();
    Optional<ContractDetailResponse> findById(UUID id);
    Iterable<ContractDetailResponse> findAllByContractId(UUID contractId);
    Optional<ContractDetailResponse> findByContractIdAndId(UUID contractId, UUID id);
    void save(ContractDetailRequest contractDetailRequest);
    void remove(UUID id);
    void delete(UUID id);
}
