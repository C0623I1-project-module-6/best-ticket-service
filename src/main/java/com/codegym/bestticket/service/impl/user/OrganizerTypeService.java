package com.codegym.bestticket.service.impl.user;

import com.codegym.bestticket.dto.OrganizerTypeDTO;
import com.codegym.bestticket.service.IOrganizerTypeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class OrganizerTypeService implements IOrganizerTypeService {

    @Override
    public OrganizerTypeDTO create(OrganizerTypeDTO organizerTypeDTO) {
        return null;
    }

    @Override
    public OrganizerTypeDTO update(UUID id, OrganizerTypeDTO organizerTypeDTO) {
        return null;
    }

    @Override
    public void remove(UUID id) {

    }
}
