package com.codegym.bestticket.service.impl.user;

import com.codegym.bestticket.converter.user.IOrganizerConverter;
import com.codegym.bestticket.converter.user.IUserConverter;
import com.codegym.bestticket.dto.user.OrganizerDto;
import com.codegym.bestticket.entity.user.Organizer;
import com.codegym.bestticket.entity.user.OrganizerType;
import com.codegym.bestticket.entity.user.User;
import com.codegym.bestticket.exception.user.OrganizerNotFoundException;
import com.codegym.bestticket.payload.ResponsePayload;
import com.codegym.bestticket.repository.user.IOrganizerRepository;
import com.codegym.bestticket.repository.user.IOrganizerTypeRepository;
import com.codegym.bestticket.repository.user.IRoleRepository;
import com.codegym.bestticket.repository.user.IUserRepository;
import com.codegym.bestticket.service.IOrganizerService;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.Date;
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
    public ResponsePayload update(OrganizerDto organizerDto) {
        try {
            UserDetails userDetails = (UserDetails) SecurityContextHolder
                    .getContext()
                    .getAuthentication()
                    .getPrincipal();
            String username = userDetails.getUsername();
            User user = userRepository.findByUsername(username)
                    .orElseThrow(() -> new RuntimeException("User not found!"));
            Organizer organizer = organizerRepository.findByUserId(user.getId())
                    .orElseThrow(() -> new OrganizerNotFoundException("Organizer not found!"));
            organizerConverter.dtoToEntity(organizerDto);
            String oldName = organizer.getName();
            organizer.setName(ObjectUtils.defaultIfNull(organizerDto.getName(), oldName));
            String oldPhoneNumber = organizer.getPhoneNumber();
            organizer.setPhoneNumber(ObjectUtils.defaultIfNull(organizerDto.getPhoneNumber(), oldPhoneNumber));
            String oldEmail = organizer.getEmail();
            organizer.setEmail(ObjectUtils.defaultIfNull(organizerDto.getEmail(), oldEmail));
            String oldIdCard = organizer.getIdCard();
            organizer.setIdCard(ObjectUtils.defaultIfNull(organizerDto.getIdCard(), oldIdCard));
            String oldTaxCode = organizer.getTaxCode();
            organizer.setTaxCode(ObjectUtils.defaultIfNull(organizerDto.getTaxCode(), oldTaxCode));
            String oldBusinessCode = organizer.getBusinessCode();
            organizer.setBusinessCode(ObjectUtils.defaultIfNull(organizerDto.getBusinessCode(), oldBusinessCode));
            Date oldDateRange = organizer.getDateRange();
            organizer.setDateRange(ObjectUtils.defaultIfNull(organizerDto.getDateRange(), oldDateRange));
            String oldIssuedBy = organizer.getIssuedBy();
            organizer.setIssuedBy(ObjectUtils.defaultIfNull(organizerDto.getIssuedBy(), oldIssuedBy));
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

    public ResponsePayload findByUserId(UUID userId) {
        Optional<Organizer> organizer= organizerRepository.findByUserIdAndIsDeletedFalse(userId);
        return organizer.map(o->
                ResponsePayload.builder()
                        .message("Organizer by UserId" + userId)
                        .status(HttpStatus.OK)
                        .data(organizerConverter.entityToDto(o))
                        .build()
        ).orElse(
                ResponsePayload.builder().message("Organizer by userId" + userId + "not found or is deleted!")
                        .status(HttpStatus.INTERNAL_SERVER_ERROR)
                        .build()
        );
    }
}
