package com.codegym.bestticket.service.impl.user;

import com.codegym.bestticket.converter.user.OrganizerConverter;
import com.codegym.bestticket.dto.OrganizerDTO;
import com.codegym.bestticket.dto.response.user.OrganizerDtoResponse;
import com.codegym.bestticket.entity.user.Organizer;
import com.codegym.bestticket.entity.user.OrganizerType;
import com.codegym.bestticket.entity.user.User;
import com.codegym.bestticket.repository.IOrganizerRepository;
import com.codegym.bestticket.repository.IOrganizerTypeRepository;
import com.codegym.bestticket.repository.IUserRepository;
import com.codegym.bestticket.service.IOrganizerService;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
@Transactional
public class OrganizerService implements IOrganizerService {
    private final OrganizerConverter organizerConverter;
    private final IOrganizerRepository organizerRepository;
    private final IUserRepository userRepository;
    private final IOrganizerTypeRepository organizerTypeRepository;

    @Override
    public OrganizerDtoResponse create(OrganizerDTO organizerDTO) {
        UUID userId = organizerDTO.getUser();
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));
        UUID organizerTypeId = organizerDTO.getOrganizerType();
        OrganizerType organizerType = organizerTypeRepository.findById(organizerTypeId)
                .orElseThrow(() -> new RuntimeException("Organizer type not found"));
        Organizer organizer = organizerConverter.dtoToEntity(organizerDTO);
        organizer.setUser(user);
        organizer.setOrganizerType(organizerType);
        organizer.setIsDelete(false);
        organizerRepository.save(organizer);
        return organizerConverter.entityToDto(organizer);
    }

    @Override
    public OrganizerDtoResponse update(UUID id, OrganizerDTO organizerDTO) {
        return null;
    }

    @Override
    public void remove(UUID id) {
        Organizer organizer = organizerRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Organizer not found"));
        organizer.setIsDelete(true);
        organizerRepository.save(organizer);
    }

    @Override
    public List<OrganizerDtoResponse> findAll() {
        return null;
    }

    @Override
    public OrganizerDtoResponse findById(UUID id) {
        return null;
    }
}
