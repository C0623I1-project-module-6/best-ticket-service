package com.codegym.bestticket.service;

import com.codegym.bestticket.dto.EventDTO;

import java.util.List;
import java.util.UUID;

public interface EventService {
    List<EventDTO> findAll();
    EventDTO findEventById(UUID event_id);

    void removeEvent(UUID event_id);

    EventDTO createEvent(EventDTO eventDTO);

    EventDTO updateEvent(UUID event_id,EventDTO eventDTO);
}
