package com.codegym.bestticket.service;

import com.codegym.bestticket.dto.event.EventDTO;

import java.util.List;
import java.util.UUID;

public interface IEventService {
    List<EventDTO> findAll();
    EventDTO findEventById(UUID event_id);

    void removeEvent(UUID event_id);

    EventDTO createEvent(EventDTO eventDTO);

    EventDTO updateEvent(UUID event_id,EventDTO eventDTO);
}
