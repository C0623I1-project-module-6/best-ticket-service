package com.codegym.bestticket.service.impl;

import com.codegym.bestticket.converter.event.EventTypeConverter;
import com.codegym.bestticket.dto.EventTypeDTO;
import com.codegym.bestticket.entity.event.EventType;
import com.codegym.bestticket.repository.IEventTypeRepository;
import com.codegym.bestticket.service.EventTypeService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class EventTypeServiceImpl implements EventTypeService {
    private final EventTypeConverter eventTypeConverter;
    private final IEventTypeRepository eventTypeRepository;

    public EventTypeServiceImpl(EventTypeConverter eventTypeConverter,
                                IEventTypeRepository eventTypeRepository) {
        this.eventTypeConverter = eventTypeConverter;
        this.eventTypeRepository = eventTypeRepository;
    }

    @Override
    public List<EventTypeDTO> findAll() {
        return eventTypeConverter.entitiesToDTOs(eventTypeRepository.findAll());
    }

    @Override
    public EventTypeDTO findById(UUID id) {
        return eventTypeConverter.entityToDTO(eventTypeRepository.findById(id)
                        .orElseThrow(() -> new EntityNotFoundException("Event is not found")));
    }

    @Override
    public void removeById(UUID id) {
        EventType eventType = eventTypeRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("EventType is not found"));

        eventTypeRepository.delete(eventType);
    }

}
