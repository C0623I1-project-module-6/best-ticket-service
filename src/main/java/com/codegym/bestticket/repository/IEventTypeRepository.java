package com.codegym.bestticket.repository;

import com.codegym.bestticket.entity.event.EventType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
public interface IEventTypeRepository extends JpaRepository<EventType, UUID> {
}
