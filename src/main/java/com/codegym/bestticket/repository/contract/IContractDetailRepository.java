package com.codegym.bestticket.repository.contract;

import com.codegym.bestticket.entity.contract.ContractDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface IContractDetailRepository extends JpaRepository<ContractDetail, UUID> {
    Iterable<ContractDetail> findAllByContractId(UUID contractId);

    Optional<ContractDetail> findByContractIdAndId(UUID contractId, UUID id);
}

