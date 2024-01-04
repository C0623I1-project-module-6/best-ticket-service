package com.codegym.bestticket.service.impl.event;

import com.codegym.bestticket.converter.event.IEventTypeConverter;
import com.codegym.bestticket.dto.event.EventTypeDTO;
import com.codegym.bestticket.entity.event.EventType;
import com.codegym.bestticket.repository.event.IEventTypeRepository;
import com.codegym.bestticket.service.IEventTypeService;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class EventTypeService implements IEventTypeService {
    private final IEventTypeConverter IEventTypeConverter;
    private final IEventTypeRepository eventTypeRepository;


    @Override
    public List<EventTypeDTO> findAll() {
        return IEventTypeConverter.entitiesToDTOs(eventTypeRepository.findAll());
    }

    @Override
    public EventTypeDTO findById(UUID id) {
        return IEventTypeConverter.entityToDTO(eventTypeRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Event is not found")));
    }

    @Override
    public void removeById(UUID id) {
        EventType eventType = eventTypeRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("EventType is not found"));

        eventTypeRepository.delete(eventType);
    }

}
