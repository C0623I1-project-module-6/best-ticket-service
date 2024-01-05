package com.codegym.bestticket.service;

import com.codegym.bestticket.dto.event.EventDTO;
import com.codegym.bestticket.payload.response.event.EventResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.UUID;

public interface IEventService {
    EventResponse findAll(int page, int pageSize);
    EventResponse findEventById(UUID eventId);

    EventResponse removeEvent(UUID event_id);

    EventResponse createEvent(EventDTO eventDTO);

    EventResponse updateEvent(UUID event_id,EventDTO eventDTO);

    List<EventDTO> findByNameContaining(String text);

    EventResponse findByEventTypeNamesAndIsDeletedFalse(List<String> eventTypeNames, int page, int pageSize);
}
