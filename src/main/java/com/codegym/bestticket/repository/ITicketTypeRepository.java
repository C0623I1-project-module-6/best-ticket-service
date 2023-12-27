package com.codegym.bestticket.repository;

import com.codegym.bestticket.entity.ticket.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ITicketTypeRepository extends JpaRepository<Ticket, UUID> {
}
