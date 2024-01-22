package com.codegym.bestticket.service.impl.user;

import com.codegym.bestticket.converter.user.IOrganizerConverter;
import com.codegym.bestticket.converter.user.IUserConverter;
import com.codegym.bestticket.dto.user.OrganizerDto;
import com.codegym.bestticket.entity.user.Organizer;
import com.codegym.bestticket.entity.user.OrganizerType;
import com.codegym.bestticket.entity.user.User;
import com.codegym.bestticket.payload.ResponsePayload;
import com.codegym.bestticket.repository.user.IOrganizerRepository;
import com.codegym.bestticket.repository.user.IOrganizerTypeRepository;
import com.codegym.bestticket.repository.user.IRoleRepository;
import com.codegym.bestticket.repository.user.IUserRepository;
import com.codegym.bestticket.service.IOrganizerService;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
@Transactional
public class OrganizerService implements IOrganizerService {
    private final IOrganizerConverter organizerConverter;
    private final IUserConverter userConverter;
    private final IOrganizerRepository organizerRepository;
    private final IUserRepository userRepository;
    private final IRoleRepository roleRepository;
    private final IOrganizerTypeRepository organizerTypeRepository;

    @Override
    public ResponsePayload create(OrganizerDto organizerDto) {
        try {
            Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
            UserDetails userDetails = (UserDetails) authentication.getPrincipal();
            String username = userDetails.getUsername();
            User user = userRepository.findByUsername(username)
                    .orElseThrow(() -> new EntityNotFoundException("User not found!"));
            Organizer organizer = organizerConverter.dtoToEntity(organizerDto);
            if (organizerDto.getIdCard() != null) {
                OrganizerType individualType = organizerTypeRepository.findByName("Cá nhân")
                        .orElseThrow(() -> new RuntimeException("Organizer type not found!"));
                organizer.setOrganizerType(individualType);
            } else if (organizerDto.getBusinessCode() != null) {
                OrganizerType companyType = organizerTypeRepository.findByName("Doanh nghiệp/Nhà tổ chức")
                        .orElseThrow(() -> new RuntimeException("Organizer type not found!"));
                organizer.setOrganizerType(companyType);
            }
            organizer.setUser(user);
            organizer.setIsDeleted(false);
            organizerRepository.save(organizer);
            OrganizerDto response = organizerConverter.entityToDto(organizer);
            user.getRoles().add(roleRepository.findByName("ORGANIZER")
                    .orElseThrow(() -> new RuntimeException("Role not found!")));
            Map<String, Object> result = userConverter.mapUserToResult(user);
            response.setResult(result);
            response.setOrganizerType(organizer.getOrganizerType().getName());
            return ResponsePayload.builder()
                    .message("Add organizer successfully!!!")
                    .status(HttpStatus.CREATED)
                    .data(response)
                    .build();
        } catch (RuntimeException e) {
            return ResponsePayload.builder()
                    .message("Add organizer failed!")
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .build();
        }
    }


    @Override
    public ResponsePayload update(UUID id, OrganizerDto organizerDto) {
        try {
            Optional<Organizer> optionalOrganizer = organizerRepository.findById(id);
            if (optionalOrganizer.isEmpty()) {
                throw new EntityNotFoundException("Organizer not found!" + id);
            }
            Organizer organizer = optionalOrganizer.get();
            String oldPhoneNumber = organizer.getPhoneNumber();
            String oldEmail = organizer.getEmail();
            String oldIdCard = organizer.getIdCard();
            String oldTaxCode = organizer.getTaxCode();
            organizerConverter.dtoToEntity(organizerDto);
            organizer.setPhoneNumber(oldPhoneNumber);
            organizer.setEmail(oldEmail);
            organizer.setIdCard(oldIdCard);
            organizer.setTaxCode(oldTaxCode);
            organizerRepository.save(organizer);
            OrganizerDto response = organizerConverter.entityToDto(organizer);
            return ResponsePayload.builder()
                    .message("Edit organizer successfully!!!")
                    .status(HttpStatus.OK)
                    .data(response)
                    .build();
        } catch (RuntimeException e) {
            return ResponsePayload.builder()
                    .message("Edit organizer failed!")
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .build();
        }
    }



    @Override
    public ResponsePayload findById(UUID id) {
        try {
            Organizer organizer = organizerRepository.findByIdAndIsDeletedFalse(id)
                    .orElseThrow(() -> new EntityNotFoundException("Id not found!"));
            OrganizerDto response = organizerConverter.entityToDto(organizer);
            return ResponsePayload.builder()
                    .message("Organizer by" + id)
                    .status(HttpStatus.OK)
                    .data(response)
                    .build();
        } catch (RuntimeException e) {
            return ResponsePayload.builder()
                    .message("Organizer by" + id + "not found or is deleted!")
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .build();
        }

    }
}
