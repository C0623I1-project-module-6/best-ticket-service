package com.codegym.bestticket.service.impl.event;

import com.codegym.bestticket.converter.event.impl.IEventConverter;
import com.codegym.bestticket.dto.event.EventDTO;
import com.codegym.bestticket.entity.event.Event;
import com.codegym.bestticket.repository.event.IEventRepository;
import com.codegym.bestticket.service.IEventService;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class EventService implements IEventService {
    private final IEventRepository eventRepository;
    private final IEventConverter eventConverter;

    @Override
    public List<EventDTO> findAll() {
        return eventConverter.entitiesToDTOs(eventRepository.findAllByIsDeletedFalse());
    }

    @Override
    public EventDTO findEventById(UUID event_id) {
        Event event = eventRepository.findByIdAndIsDeletedFalse(event_id);

        if (event != null) {
            return eventConverter.entityToDTO(event);
        } else {
            throw new EntityNotFoundException("Event is not found or is deleted");
        }
    }


    @Override
    public void removeEvent(UUID event_id) {
        Event event = eventRepository.findById(event_id)
                .orElseThrow(() -> new EntityNotFoundException("Event is not found"));

        event.setIsDeleted(true);
        eventRepository.save(event);
    }

    @Override
    public EventDTO createEvent(EventDTO eventDTO) {
        if (eventDTO == null) throw new IllegalArgumentException("EventDTO is not null");
        Event newEvent = eventConverter.dtoToEntity(eventDTO);
        return eventConverter.entityToDTO((newEvent));
    }

    @Override
    public EventDTO updateEvent(UUID event_id, EventDTO eventDTO) {
        if (eventDTO == null) throw new IllegalArgumentException("EventDTO is not null");
        Event event = eventRepository.findById(event_id)
                .orElseThrow(() -> new EntityNotFoundException("Event is not found"));
        if (eventDTO.getName() != null) {
            event.setName(eventDTO.getName());
        }
        if (eventDTO.getAddress() != null) {
            event.setAddress(eventDTO.getAddress());
        }
        if (eventDTO.getDescription() != null) {
            event.setDescription(eventDTO.getDescription());
        }
        if (eventDTO.getImage() != null) {
            event.setImage(eventDTO.getImage());
        }
        if (eventDTO.getDuration() != null) {
            event.setDuration(eventDTO.getDuration());
        }
        if (eventDTO.getIsDeleted() != null) {
            event.setIsDeleted(eventDTO.getIsDeleted());
        }
        eventRepository.save(event);
        return eventConverter.entityToDTO(event);
    }

}