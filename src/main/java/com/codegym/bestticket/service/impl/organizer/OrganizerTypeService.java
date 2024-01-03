package com.codegym.bestticket.service.impl.organizer;

import com.codegym.bestticket.converter.user.impl.OrganizerTypeConverter;
import com.codegym.bestticket.dto.request.organizer.OrganizerTypeRequestDTO;
import com.codegym.bestticket.entity.organizer.OrganizerType;
import com.codegym.bestticket.repository.organizer.IOrganizerTypeRepository;
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
    public OrganizerTypeRequestDTO create(OrganizerTypeRequestDTO organizerTypeRequestDTO) {
        OrganizerType organizerType =
                organizerTypeConverter.dtoToEntity(organizerTypeRequestDTO);
        organizerType.setIsDeleted(false);
        organizerTypeRepository.save(organizerType);
        return organizerTypeConverter.entityToDto(organizerType);
    }

    @Override
    public OrganizerTypeRequestDTO update(UUID id, OrganizerTypeRequestDTO organizerTypeRequestDTO) {
        return null;
    }

    @Override
    public void remove(UUID id) {
        OrganizerType organizerType = organizerTypeRepository.findById(id)
                        .orElseThrow(() -> new EntityNotFoundException("Organizer type not found"));
        organizerType.setIsDeleted(true);
        organizerTypeRepository.save(organizerType);
    }

    @Override
    public void delete(UUID id) {
        organizerTypeRepository.deleteById(id);
    }
}
