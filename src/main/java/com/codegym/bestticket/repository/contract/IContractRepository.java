package com.codegym.bestticket.repository.contract;

import com.codegym.bestticket.entity.contract.Contract;
import com.codegym.bestticket.entity.user.Customer;
import com.codegym.bestticket.entity.user.Organizer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;


public interface IContractRepository extends JpaRepository<Contract, UUID> {
    Iterable<Contract> searchAllByCustomer(Customer customer);

    Iterable<Contract> searchAllByOrganizer(Organizer organizer);
}
