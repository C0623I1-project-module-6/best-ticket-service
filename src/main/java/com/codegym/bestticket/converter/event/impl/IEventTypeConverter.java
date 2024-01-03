package com.codegym.bestticket.converter.event.impl;

import com.codegym.bestticket.dto.EventTypeDTO;
import com.codegym.bestticket.entity.event.EventType;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class IEventTypeConverter implements com.codegym.bestticket.converter.event.IEventTypeConverter {


    @Override
    public EventTypeDTO entityToDTO(EventType element) {
        EventTypeDTO result = new EventTypeDTO();
        BeanUtils.copyProperties(element, result);
        return result;
    }

    @Override
    public List<EventTypeDTO> entitiesToDTOs(List<EventType> elements) {
        return elements.stream()
                .map(this::entityToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public EventType dtoToEntity(EventTypeDTO element) {
        EventType result = new EventType();
        BeanUtils.copyProperties(element, result);
        return result;
    }
}
