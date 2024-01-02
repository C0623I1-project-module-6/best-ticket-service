package com.codegym.bestticket.repository;

import com.codegym.bestticket.entity.ticket.TicketType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ITicketTypeRepository extends JpaRepository<TicketType, UUID> {
}
