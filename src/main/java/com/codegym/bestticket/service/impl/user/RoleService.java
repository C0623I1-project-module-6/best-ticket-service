package com.codegym.bestticket.service.impl.user;

import com.codegym.bestticket.converter.user.IRoleConverter;
import com.codegym.bestticket.dto.user.RoleDto;
import com.codegym.bestticket.entity.user.Role;
import com.codegym.bestticket.payload.ResponsePayload;
import com.codegym.bestticket.repository.user.IRoleRepository;
import com.codegym.bestticket.service.IRoleService;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
@Transactional
public class RoleService implements IRoleService {
    private final IRoleConverter roleConverter;
    private final IRoleRepository roleRepository;

    @Override
    public ResponsePayload create(RoleDto roleDto) {
        try {
            Role role = roleConverter.dtoToEntity(roleDto);
            role.setIsDeleted(false);
            roleRepository.save(role);
            roleDto = roleConverter.entityToDto(role);
            return ResponsePayload.builder()
                    .message("Add role successfully!!!")
                    .status(HttpStatus.CREATED)
                    .data(roleDto)
                    .build();
        } catch (RuntimeException e) {
            return ResponsePayload.builder()
                    .message("Add role failed!")
                    .status(HttpStatus.BAD_REQUEST)
                    .build();
        }
    }

    @Override

    public ResponsePayload update(UUID id, RoleDto roleDto) {
        try {
            Optional<Role> optionalRole = roleRepository.findById(id);
            if (optionalRole.isEmpty()) {
                throw new EntityNotFoundException("Role not found is" + id);
            }
            Role role = roleConverter.dtoToEntity(roleDto);
            roleRepository.save(role);
            roleDto = roleConverter.entityToDto(role);
            return ResponsePayload.builder()
                    .message("Update role successfully!!!")
                    .status(HttpStatus.OK)
                    .data(roleDto)
                    .build();
        } catch (RuntimeException e) {
            return ResponsePayload.builder()
                    .message("Update role failed!")
                    .status(HttpStatus.BAD_REQUEST)
                    .build();
        }
    }

    @Override
    public ResponsePayload delete(UUID id) {
        try {
            Role role = roleRepository.findById(id)
                    .orElseThrow(() -> new EntityNotFoundException("Role not found"));
            role.setIsDeleted(true);
            roleRepository.save(role);
            return ResponsePayload.builder()
                    .message("Role deleted!!!")
                    .status(HttpStatus.OK)
                    .build();
        } catch (RuntimeException e) {
            return ResponsePayload.builder()
                    .message("Role not found or is deleted ")
                    .status(HttpStatus.NOT_FOUND)
                    .build();
        }
    }
}
