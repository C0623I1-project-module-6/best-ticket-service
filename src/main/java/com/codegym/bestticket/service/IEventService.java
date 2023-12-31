package com.codegym.bestticket.service;

import com.codegym.bestticket.dto.event.EventDTO;
import com.codegym.bestticket.payload.response.event.EventResponse;
import java.util.List;
import java.util.UUID;

public interface IEventService {
    EventResponse findAll(int page, int pageSize);
    EventResponse findEventById(UUID eventId);


    EventResponse removeEvent(UUID event_id);

    EventResponse createEvent(EventDTO eventDTO);

    EventResponse updateEvent(UUID event_id,EventDTO eventDTO);

    EventResponse findByNameContaining(String text,int page, int pageSize);

    EventResponse findByEventTypeNamesAndIsDeletedFalse(List<String> eventTypeNames, int page, int pageSize);

    EventResponse findBySearchTermAndEventTypeNames(String searchTerm,List<String> eventTypeNames,int page,int pageSize);

}
