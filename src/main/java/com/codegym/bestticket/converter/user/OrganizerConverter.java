package com.codegym.bestticket.converter.user;

import com.codegym.bestticket.dto.CustomerDTO;
import com.codegym.bestticket.dto.OrganizerDTO;
import com.codegym.bestticket.dto.response.user.CustomerDtoResponse;
import com.codegym.bestticket.dto.response.user.OrganizerDtoResponse;
import com.codegym.bestticket.entity.user.Customer;
import com.codegym.bestticket.entity.user.Organizer;
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
