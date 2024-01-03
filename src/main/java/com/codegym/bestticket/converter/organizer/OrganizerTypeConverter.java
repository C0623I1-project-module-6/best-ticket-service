package com.codegym.bestticket.converter.organizer;

import com.codegym.bestticket.dto.request.organizer.OrganizerTypeRequestDTO;
import com.codegym.bestticket.entity.organizer.OrganizerType;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class OrganizerTypeConverter {
    public OrganizerTypeRequestDTO entityToDto(OrganizerType organizerType) {
        OrganizerTypeRequestDTO organizerTypeRequestDTO = new OrganizerTypeRequestDTO();
        BeanUtils.copyProperties(organizerType, organizerTypeRequestDTO);
        return organizerTypeRequestDTO;
    }

    public OrganizerType dtoToEntity(OrganizerTypeRequestDTO organizerTypeRequestDTO) {
        OrganizerType organizerType= new OrganizerType();
        BeanUtils.copyProperties(organizerTypeRequestDTO, organizerType);
        return organizerType;
    }
}
