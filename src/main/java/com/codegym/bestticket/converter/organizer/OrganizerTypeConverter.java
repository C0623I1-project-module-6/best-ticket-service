package com.codegym.bestticket.converter.organizer;

import com.codegym.bestticket.dto.OrganizerTypeDTO;
import com.codegym.bestticket.entity.organizer.OrganizerType;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class OrganizerTypeConverter {
    public OrganizerTypeDTO entityToDto(OrganizerType organizerType) {
        OrganizerTypeDTO organizerTypeDTO = new OrganizerTypeDTO();
        BeanUtils.copyProperties(organizerType, organizerTypeDTO);
        return organizerTypeDTO;
    }

    public OrganizerType dtoToEntity(OrganizerTypeDTO organizerTypeDTO) {
        OrganizerType organizerType= new OrganizerType();
        BeanUtils.copyProperties(organizerTypeDTO, organizerType);
        return organizerType;
    }
}
