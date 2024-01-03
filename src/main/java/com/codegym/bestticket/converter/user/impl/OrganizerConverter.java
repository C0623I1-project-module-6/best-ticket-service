package com.codegym.bestticket.converter.user.impl;

import com.codegym.bestticket.dto.request.organizer.OrganizerRequestDTO;
import com.codegym.bestticket.dto.response.organizer.OrganizerResponseDTO;
import com.codegym.bestticket.entity.organizer.Organizer;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class OrganizerConverter {
    public OrganizerResponseDTO entityToDto(Organizer organizer) {
        OrganizerResponseDTO organizerResponseDTO = new OrganizerResponseDTO();
        BeanUtils.copyProperties(organizer, organizerResponseDTO);
        return organizerResponseDTO;
    }

    public Organizer dtoToEntity(OrganizerRequestDTO organizerRequestDTO) {
        Organizer organizer= new Organizer();
        BeanUtils.copyProperties(organizerRequestDTO, organizer);
        return organizer;
    }

    public List<OrganizerResponseDTO> entitiesToDTOs(List<Organizer> organizers) {
        return organizers.stream()
                .map(this::entityToDto)
                .collect(Collectors.toList());
    }
}
