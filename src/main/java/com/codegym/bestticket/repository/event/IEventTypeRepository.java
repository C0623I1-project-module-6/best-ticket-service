package com.codegym.bestticket.repository.event;

import com.codegym.bestticket.entity.event.EventType;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface IEventTypeRepository extends JpaRepository<EventType, UUID> {
    EventType findEventTypeByName(String name);
}
