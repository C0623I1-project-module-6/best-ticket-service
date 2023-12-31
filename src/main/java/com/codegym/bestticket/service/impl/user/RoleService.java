package com.codegym.bestticket.service.impl.user;

import com.codegym.bestticket.converter.user.IRoleConverter;
import com.codegym.bestticket.dto.user.RoleDto;
import com.codegym.bestticket.entity.user.Role;
import com.codegym.bestticket.payload.ResponsePayload;
import com.codegym.bestticket.repository.user.IRoleRepository;
import com.codegym.bestticket.service.IRoleService;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@Transactional
@ComponentScan(basePackageClasses = ModelMapper.class)
public class RoleService implements IRoleService {
    private final IRoleConverter roleConverter;
    private final IRoleRepository roleRepository;
    private final ModelMapper modelMapper;

    public RoleService(IRoleConverter roleConverter, IRoleRepository roleRepository, ModelMapper modelMapper) {
        this.roleRepository = roleRepository;
        this.modelMapper = modelMapper;
        this.roleConverter = roleConverter;
    }

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
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
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
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
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
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .build();
        }
    }

    @Override
    public Optional<RoleDto> findById(UUID id) {
        Role entity = roleRepository.findById(id).orElse(null);
        return Optional.ofNullable(modelMapper.map(entity, RoleDto.class));
    }
}
