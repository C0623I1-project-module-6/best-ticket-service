package com.codegym.bestticket.repository.contract;

import com.codegym.bestticket.entity.contract.Booking;
import com.codegym.bestticket.entity.customer.Customer;
import com.codegym.bestticket.entity.organizer.Organizer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

;

public interface IContractRepository extends JpaRepository<Booking, UUID> {
    Iterable<Booking> searchAllByCustomer(Customer customer);
    Iterable<Booking> searchAllByOrganizer(Organizer organizer);
}
