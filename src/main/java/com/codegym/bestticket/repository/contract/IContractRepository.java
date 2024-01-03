package com.codegym.bestticket.repository.contract;

import com.codegym.bestticket.entity.contract.Contract;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.UUID;

public interface IContractRepository extends JpaRepository<Contract, UUID> {
}
