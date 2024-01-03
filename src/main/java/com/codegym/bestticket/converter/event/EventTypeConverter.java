package com.codegym.bestticket.converter.event;

import com.codegym.bestticket.dto.EventTypeDTO;
import com.codegym.bestticket.entity.event.EventType;

import java.util.List;

public interface EventTypeConverter {
    EventTypeDTO entityToDTO(EventType element);

    List<EventTypeDTO> entitiesToDTOs(List<EventType> element);

    EventType dtoToEntity(EventTypeDTO element);
}
