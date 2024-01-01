package com.codegym.bestticket.service.impl.user;

import com.codegym.bestticket.converter.user.OrganizerTypeConverter;
import com.codegym.bestticket.dto.OrganizerTypeDTO;
import com.codegym.bestticket.entity.user.OrganizerType;
import com.codegym.bestticket.repository.IOrganizerTypeRepository;
import com.codegym.bestticket.service.IOrganizerTypeService;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
@Transactional
public class OrganizerTypeService implements IOrganizerTypeService {
    private final OrganizerTypeConverter organizerTypeConverter;
    private final IOrganizerTypeRepository organizerTypeRepository;

    @Override
    public OrganizerTypeDTO create(OrganizerTypeDTO organizerTypeDTO) {
        OrganizerType organizerType =
                organizerTypeConverter.dtoToEntity(organizerTypeDTO);
        organizerType.setIsDelete(false);
        organizerTypeRepository.save(organizerType);
        return organizerTypeConverter.entityToDto(organizerType);
    }

    @Override
    public OrganizerTypeDTO update(UUID id, OrganizerTypeDTO organizerTypeDTO) {
        return null;
    }

    @Override
    public void remove(UUID id) {
        OrganizerType organizerType = organizerTypeRepository.findById(id)
                        .orElseThrow(() -> new EntityNotFoundException("Organizer type not found"));
        organizerType.setIsDelete(true);
        organizerTypeRepository.save(organizerType);
    }

    @Override
    public void delete(UUID id) {
        organizerTypeRepository.deleteById(id);
    }
}
