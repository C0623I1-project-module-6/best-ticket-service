package com.codegym.bestticket.service;

import com.codegym.bestticket.dto.EventDTO;

import java.util.List;
import java.util.UUID;

public interface IEventService {
    List<EventDTO> findAll();
    EventDTO findEventById(UUID eventId);

    void removeEvent(UUID event_id);

    EventDTO createEvent(EventDTO eventDTO);

    EventDTO updateEvent(UUID event_id,EventDTO eventDTO);

    List<EventDTO> findByNameContaining(String text);

    List<EventDTO> findByEventTypeNames(List<String> eventTypeNames);
}
