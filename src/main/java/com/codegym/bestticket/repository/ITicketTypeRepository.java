package com.codegym.bestticket.repository;

import com.codegym.bestticket.entity.ticket.TicketType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ITicketTypeRepository extends JpaRepository<TicketType, UUID> {
}
