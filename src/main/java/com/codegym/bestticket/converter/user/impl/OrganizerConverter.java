package com.codegym.bestticket.converter.user.impl;


import com.codegym.bestticket.converter.user.IOrganizerConverter;
import com.codegym.bestticket.dto.user.OrganizerDto;
import com.codegym.bestticket.entity.user.Organizer;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class OrganizerConverter implements IOrganizerConverter {
    public OrganizerDto entityToDto(Organizer organizer) {
        OrganizerDto organizerDto = new OrganizerDto();
        BeanUtils.copyProperties(organizer, organizerDto);
        return organizerDto;
    }

    public Organizer dtoToEntity(OrganizerDto organizerDto) {
        Organizer organizer = new Organizer();
        BeanUtils.copyProperties(organizerDto, organizer);

        return organizer;
    }

    public List<OrganizerDto> entitiesToDtos(List<Organizer> organizers) {
        return organizers.stream()
                .map(this::entityToDto)
                .collect(Collectors.toList());
    }

}
