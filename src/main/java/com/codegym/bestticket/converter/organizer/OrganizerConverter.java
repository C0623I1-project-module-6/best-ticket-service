package com.codegym.bestticket.converter.organizer;

import com.codegym.bestticket.dto.OrganizerDTO;
import com.codegym.bestticket.dto.response.organizer.OrganizerDtoResponse;
import com.codegym.bestticket.entity.organizer.Organizer;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class OrganizerConverter {
    public OrganizerDtoResponse entityToDto(Organizer organizer) {
        OrganizerDtoResponse organizerDtoResponse = new OrganizerDtoResponse();
        BeanUtils.copyProperties(organizer, organizerDtoResponse);
        return organizerDtoResponse;
    }

    public Organizer dtoToEntity(OrganizerDTO organizerDTO) {
        Organizer organizer= new Organizer();
        BeanUtils.copyProperties(organizerDTO, organizer);
        return organizer;
    }

    public List<OrganizerDtoResponse> entitiesToDTOs(List<Organizer> organizers) {
        return organizers.stream()
                .map(this::entityToDto)
                .collect(Collectors.toList());
    }
}
