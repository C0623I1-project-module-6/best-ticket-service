package com.codegym.bestticket.service.impl.event;

import com.codegym.bestticket.converter.event.IEventConverter;
import com.codegym.bestticket.converter.event.IEventTypeConverter;
import com.codegym.bestticket.dto.event.EventDTO;
import com.codegym.bestticket.dto.event.EventTypeDTO;
import com.codegym.bestticket.entity.event.Event;
import com.codegym.bestticket.entity.event.EventType;
import com.codegym.bestticket.entity.event.Time;
import com.codegym.bestticket.entity.location.Location;
import com.codegym.bestticket.payload.request.event.CreateEventRequest;
import com.codegym.bestticket.payload.response.event.EventResponse;
import com.codegym.bestticket.repository.event.IEventRepository;
import com.codegym.bestticket.repository.event.ITimeRepository;
import com.codegym.bestticket.repository.location.ILocationRepository;
import com.codegym.bestticket.service.IEventService;
import com.codegym.bestticket.service.IEventTypeService;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;


@Service
@AllArgsConstructor
public class EventService implements IEventService {
    private final IEventRepository eventRepository;
    private final IEventConverter eventConverter;
    private final IEventTypeService eventTypeService;
    private final IEventTypeConverter eventTypeConverter;
    private final ILocationRepository locationRepository;
    private final ITimeRepository timeRepository;

    @Override
    public EventResponse findAll(int page, int pageSize) {
        Pageable pageable = PageRequest.of(page, pageSize);
        Page<Event> eventsPage = eventRepository.findAllByIsDeletedFalse(pageable);
        List<EventDTO> eventDTOs = eventConverter.entitiesToDTOs(eventsPage.getContent());
        return EventResponse.builder().data(eventDTOs).totalPages(eventsPage.getTotalPages()).httpStatus(HttpStatus.OK).build();
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
    public EventResponse createEvent(CreateEventRequest eventRequest) {
        String province = eventRequest.getProvince();
        String district = eventRequest.getDistrict();
        String address = eventRequest.getAddress();
        Time existingTime = timeRepository.findByTime(eventRequest.getStartDateTime());
        List<EventTypeDTO> eventTypeDTOs = eventRequest.getEventTypeNames().stream().map(eventTypeService::findByName).toList();
        List<EventType> eventTypes = eventTypeDTOs.stream().map(eventTypeConverter::dtoToEntity).toList();
        Set<EventType> eventTypeSet = new HashSet<>(Set.copyOf(eventTypes));
        Event event = Event.builder()
                .name(eventRequest.getName())
                .description(eventRequest.getDescription())
                .status(eventRequest.getStatus())
                .duration(eventRequest.getDuration())
                .image(eventRequest.getImage())
                .isDeleted(false)
                .build();
        if (locationRepository.existsByProvinceAndDistrictAndAddress(province, district, address)) {
            event.setLocation(locationRepository.findByProvinceAndDistrictAndAddress(province, district, address));
        } else {
            Location newLocation = Location.builder()
                    .province(province)
                    .district(district)
                    .address(address)
                    .build();
            locationRepository.save(newLocation);
            event.setLocation(newLocation);
        }
        if (existingTime != null) {
            if (event.getTimes() == null) {
                event.setTimes(new HashSet<>());
            }
            event.getTimes().add(existingTime);
        } else {
            Time newTime = Time.builder().time(eventRequest.getStartDateTime()).build();
            timeRepository.save(newTime);
            if (event.getTimes() == null) {
                event.setTimes(new HashSet<>());
            }
            event.getTimes().add(newTime);
        }
        event.setEventTypes(eventTypeSet);
        Event savedEvent = eventRepository.save(event);
        EventDTO savedEventDTO = eventConverter.entityToDTO(savedEvent);

        return EventResponse.builder()
                .data(savedEventDTO)
                .httpStatus(HttpStatus.CREATED)
                .message("Event created successfully")
                .build();
    }

    @Override
    public EventResponse updateEvent(UUID event_id, EventDTO eventDTO) {
        if (eventDTO == null) {
            throw new IllegalArgumentException("EventDTO is not null");
        }

        Event event = eventRepository.findById(event_id)
                .orElseThrow(() -> new EntityNotFoundException("Event is not found"));

        Optional.ofNullable(eventDTO.getName()).ifPresent(event::setName);
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
    public EventResponse findByNameContaining(String text, int page, int pageSize) {
        Pageable pageable = PageRequest.of(page, pageSize);
        Page<Event> eventPage = eventRepository.findByNameContainingAndIsDeletedFalse(text, pageable);
        List<EventDTO> events = eventConverter.entitiesToDTOs(eventPage.getContent());
        return EventResponse.builder().data(events).totalPages(eventPage.getTotalPages()).httpStatus(HttpStatus.OK).message("Page Event By Search Term").build();
    }

    @Override
    public EventResponse findByEventTypeNamesAndIsDeletedFalse(List<String> eventTypeNames, int page, int pageSize) {
        Pageable pageable = PageRequest.of(page, pageSize);
        Page<Event> eventPage = eventRepository.findByEventTypeNamesAndIsDeletedFalse(eventTypeNames, pageable);
        List<EventDTO> eventDTOs = eventConverter.entitiesToDTOs(eventPage.getContent());
        return EventResponse.builder().data(eventDTOs).totalPages(eventPage.getTotalPages()).message("Page Event By List EventType").httpStatus(HttpStatus.OK).build();
    }

    @Override
    public EventResponse findBySearchTermAndEventTypeNames(String searchTerm, List<String> eventTypeNames, int page, int pageSize) {
        Pageable pageable = PageRequest.of(page, pageSize);
        Page<Event> eventPage = eventRepository.findByTextAndEventTypeNames(searchTerm, eventTypeNames, pageable);
        List<EventDTO> eventDTOs = eventConverter.entitiesToDTOs(eventPage.getContent());
        return EventResponse.builder().data(eventDTOs).totalPages(eventPage.getTotalPages()).message("Page Event By Search Term List EventType").httpStatus(HttpStatus.OK).build();
    }

}