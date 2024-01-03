package com.codegym.bestticket.service.impl.user;

import com.codegym.bestticket.converter.user.IRoleConverter;
import com.codegym.bestticket.dto.user.RoleDto;
import com.codegym.bestticket.entity.user.Role;
import com.codegym.bestticket.repository.user.IRoleRepository;
import com.codegym.bestticket.service.IRoleService;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
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
    public RoleDto create(RoleDto roleDto) {
        Role role =
                roleConverter.dtoToEntity(roleDto);
        role.setIsDeleted(false);
        roleRepository.save(role);
        return roleConverter.entityToDto(role);
    }

    @Override
    public RoleDto update(UUID id, RoleDto roleRequest) {
        Optional<Role> optionalRole = roleRepository.findById(id);
        if (optionalRole.isEmpty()) {
            throw new EntityNotFoundException("Role not found is" + id);
        }
        Role role = Role.builder().build();
        return roleConverter.entityToDto(role);
    }

    @Override
    public void remove(UUID id) {
        Role role = roleRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Role type not found"));
        role.setIsDeleted(true);
        roleRepository.save(role);
    }

    @Override
    public void delete(UUID id) {
        roleRepository.deleteById(id);
    }
}
