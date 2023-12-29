package com.codegym.bestticket.converter;

import com.codegym.bestticket.dto.EventDTO;
import com.codegym.bestticket.dto.EventTypeDTO;
import com.codegym.bestticket.entity.event.Event;
import com.codegym.bestticket.entity.event.EventType;

import java.util.List;

public interface EventTypeConverter {
    EventTypeDTO entityToDTO(EventType element);

    List<EventTypeDTO> entitiesToDTOs(List<EventType> element);

    EventType dtoToEntity(EventTypeDTO element);
}
