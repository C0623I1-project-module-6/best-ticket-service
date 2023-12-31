package com.codegym.bestticket.converter.event.impl;

import com.codegym.bestticket.dto.event.EventDTO;
import com.codegym.bestticket.entity.event.Event;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class EventConverter implements com.codegym.bestticket.converter.event.IEventConverter {
    @Override
    public EventDTO entityToDTO(Event element) {
        EventDTO result = new EventDTO();
        BeanUtils.copyProperties(element, result);
        return result;
    }

    @Override
    public List<EventDTO> entitiesToDTOs(List<Event> elements) {
        return elements.stream()
                .map(this::entityToDTO)
                .collect(Collectors.toList());
    }
    @Override
    public Event dtoToEntity(EventDTO element) {
        Event result = new Event();
        BeanUtils.copyProperties(element, result);
        return result;
    }
}
