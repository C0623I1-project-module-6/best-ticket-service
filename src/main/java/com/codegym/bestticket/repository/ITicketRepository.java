package com.codegym.bestticket.repository;

import com.codegym.bestticket.entity.ticket.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ITicketRepository extends JpaRepository<Ticket, UUID> {
}
