package com.codegym.bestticket.converter.user.impl;

import com.codegym.bestticket.converter.user.IOrganizerTypeConverter;
import com.codegym.bestticket.entity.user.OrganizerType;
import com.codegym.bestticket.payload.request.organizer.OrganizerTypeRequestDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class OrganizerTypeConverter implements IOrganizerTypeConverter {
    public OrganizerTypeRequestDTO entityToDto(OrganizerType organizerType) {
        OrganizerTypeRequestDTO organizerTypeRequestDTO = new OrganizerTypeRequestDTO();
        BeanUtils.copyProperties(organizerType, organizerTypeRequestDTO);
        return organizerTypeRequestDTO;
    }

    public OrganizerType dtoToEntity(OrganizerTypeRequestDTO organizerTypeRequestDTO) {
        OrganizerType organizerType = new OrganizerType();
        BeanUtils.copyProperties(organizerTypeRequestDTO, organizerType);
        return organizerType;
    }
}
