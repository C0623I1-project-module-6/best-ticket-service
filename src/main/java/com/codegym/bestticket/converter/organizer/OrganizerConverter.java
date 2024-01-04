package com.codegym.bestticket.converter.organizer;

import com.codegym.bestticket.payload.request.user.organizer.OrganizerRequest;
import com.codegym.bestticket.payload.response.user.organizer.OrganizerResponse;
import com.codegym.bestticket.entity.user.organizer.Organizer;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class OrganizerConverter {
    public OrganizerResponse entityToDto(Organizer organizer) {
        OrganizerResponse organizerResponse = new OrganizerResponse();
        BeanUtils.copyProperties(organizer, organizerResponse);
        return organizerResponse;
    }

    public Organizer dtoToEntity(OrganizerRequest organizerRequest) {
        Organizer organizer= new Organizer();
        BeanUtils.copyProperties(organizerRequest, organizer);
        return organizer;
    }

    public List<OrganizerResponse> entitiesToDTOs(List<Organizer> organizers) {
        return organizers.stream()
                .map(this::entityToDto)
                .collect(Collectors.toList());
    }
}
