package com.codegym.bestticket.service.impl.event;

import com.codegym.bestticket.converter.event.IEventConverter;
import com.codegym.bestticket.dto.event.EventDTO;
import com.codegym.bestticket.entity.event.Event;
import com.codegym.bestticket.payload.response.event.EventResponse;
import com.codegym.bestticket.repository.event.IEventRepository;
import com.codegym.bestticket.service.IEventService;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import org.springframework.data.domain.Pageable;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
public class EventService implements IEventService {
    private final IEventRepository eventRepository;
    private final IEventConverter eventConverter;

    @Override
    public EventResponse findAll(int page, int pageSize) {
        Pageable pageable = PageRequest.of(page, pageSize);
        Page<Event> eventsPage = eventRepository.findAllByIsDeletedFalse(pageable);
        List<EventDTO> eventDTOs = eventConverter.entitiesToDTOs(eventsPage.getContent());
        return EventResponse.builder().data(eventDTOs).httpStatus(HttpStatus.OK).build();
    }

    @Override
    public EventResponse findEventById(UUID eventId) {
        try {
            Event event = eventRepository.findByIdAndIsDeletedFalse(eventId);

            return Optional.ofNullable(event)
                    .map(e -> EventResponse.builder().data(eventConverter.entityToDTO(e)).httpStatus(HttpStatus.OK).build())
                    .orElseThrow(() -> new EntityNotFoundException("Event is not found or is deleted"));
        } catch (EntityNotFoundException ex) {
            return EventResponse.builder().httpStatus(HttpStatus.NOT_FOUND).message(ex.getMessage()).build();
        }
    }



    @Override
    public EventResponse removeEvent(UUID event_id) {
        try {
            Event event = eventRepository.findById(event_id)
                    .orElseThrow(() -> new EntityNotFoundException("Event is not found"));

            event.setIsDeleted(true);
            eventRepository.save(event);

            return EventResponse.builder().httpStatus(HttpStatus.NO_CONTENT).message("Event removed successfully").build();
        } catch (EntityNotFoundException ex) {
            return EventResponse.builder().httpStatus(HttpStatus.NOT_FOUND).message(ex.getMessage()).build();
        }
    }

    @Override
    public EventResponse createEvent(EventDTO eventDTO) {
        return Optional.ofNullable(eventDTO)
                .map(dto -> {
                    Event event = eventConverter.dtoToEntity(dto);
                    Event savedEvent = eventRepository.save(event);
                    EventDTO savedEventDTO = eventConverter.entityToDTO(savedEvent);

                    return EventResponse.builder()
                            .data(savedEventDTO)
                            .httpStatus(HttpStatus.CREATED)
                            .message("Event created successfully")
                            .build();
                })
                .orElseGet(() -> EventResponse.builder()
                        .httpStatus(HttpStatus.BAD_REQUEST)
                        .message("EventDTO is not null")
                        .build());
    }

    @Override
    public EventResponse updateEvent(UUID event_id, EventDTO eventDTO) {
        if (eventDTO == null) {
            throw new IllegalArgumentException("EventDTO is not null");
        }

        Event event = eventRepository.findById(event_id)
                .orElseThrow(() -> new EntityNotFoundException("Event is not found"));

        Optional.ofNullable(eventDTO.getName()).ifPresent(event::setName);
        Optional.ofNullable(eventDTO.getAddress()).ifPresent(event::setAddress);
        Optional.ofNullable(eventDTO.getDescription()).ifPresent(event::setDescription);
        Optional.ofNullable(eventDTO.getImage()).ifPresent(event::setImage);
        Optional.ofNullable(eventDTO.getDuration()).ifPresent(event::setDuration);
        Optional.ofNullable(eventDTO.getIsDeleted()).ifPresent(event::setIsDeleted);
        eventRepository.save(event);
        EventDTO updatedEventDTO = eventConverter.entityToDTO(event);
        return EventResponse.builder()
                .data(updatedEventDTO)
                .httpStatus(HttpStatus.OK)
                .message("Event updated successfully")
                .build();
    }

    @Override
    public EventResponse findByNameContaining(String text,int page,int pageSize) {
        Pageable pageable = PageRequest.of(page,pageSize);
        Page<Event> eventPage = eventRepository.findByNameContainingAndIsDeletedFalse(text,pageable);
        List<EventDTO> events = eventConverter.entitiesToDTOs(eventPage.getContent());
        return EventResponse.builder().data(new PageImpl<>(events,pageable,eventPage.getTotalElements())).httpStatus(HttpStatus.OK).message("Page Event By Search Term").build();
    }

    @Override
    public EventResponse findByEventTypeNamesAndIsDeletedFalse(List<String> eventTypeNames, int page, int pageSize) {
        Pageable pageable = PageRequest.of(page, pageSize);
        Page<Event> eventPage = eventRepository.findByEventTypeNamesAndIsDeletedFalse(eventTypeNames,pageable);
        List<EventDTO> eventDTOList = eventConverter.entitiesToDTOs(eventPage.getContent());
        return EventResponse.builder().data(new PageImpl<>(eventDTOList, pageable, eventPage.getTotalElements())).message("Page Event By List EventType").httpStatus(HttpStatus.OK).build();
    }

    @Override
    public EventResponse findBySearchTermAndEventTypeNames(String searchTerm, List<String> eventTypeNames, int page, int pageSize) {
        Pageable pageable = PageRequest.of(page, pageSize);
        Page<Event> eventPage = eventRepository.findByTextAndEventTypeNames(searchTerm,eventTypeNames,pageable);
        List<EventDTO> eventDTOList = eventConverter.entitiesToDTOs(eventPage.getContent());
        return EventResponse.builder().data(new PageImpl<>(eventDTOList, pageable, eventPage.getTotalElements())).message("Page Event By Search Term List EventType").httpStatus(HttpStatus.OK).build();
    }

}