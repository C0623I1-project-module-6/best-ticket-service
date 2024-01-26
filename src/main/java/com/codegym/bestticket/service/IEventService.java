package com.codegym.bestticket.service;

import com.codegym.bestticket.dto.event.EventDTO;

import com.codegym.bestticket.payload.ResponsePayload;
import com.codegym.bestticket.payload.request.event.CreateEventRequest;
import com.codegym.bestticket.payload.response.event.EventResponse;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.UUID;

public interface IEventService {
    EventResponse findAll(int page, int pageSize);
    EventResponse findEventById(UUID eventId);

    EventResponse removeEvent(UUID event_id);

    EventResponse createEvent(CreateEventRequest eventRequest);

    EventResponse updateEvent(UUID event_id,EventDTO eventDTO);

    EventResponse findByNameContaining(String text,int page, int pageSize);

    EventResponse findByEventTypeNamesAndIsDeletedFalse(List<String> eventTypeNames, int page, int pageSize);

    EventResponse findBySearchTermAndEventTypeNames(String searchTerm,List<String> eventTypeNames,int page,int pageSize);

    EventResponse findBySearchTermAndLocationProvince(String searchTerm,String province, int page, int pageSize);

}
