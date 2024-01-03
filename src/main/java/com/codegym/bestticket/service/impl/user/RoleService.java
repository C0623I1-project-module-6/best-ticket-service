package com.codegym.bestticket.service.impl.user;

import com.codegym.bestticket.converter.user.RoleConverter;
import com.codegym.bestticket.payload.request.user.RoleRequest;
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
    private final RoleConverter roleConverter;
    private final IRoleRepository roleRepository;

    @Override
    public RoleRequest create(RoleRequest roleRequest) {
        Role role =
                roleConverter.dtoToEntity(roleRequest);
//        role.(false);
        roleRepository.save(role);
        return roleConverter.entityToDto(role);
    }

    @Override
<<<<<<< HEAD
    public RoleRequestDTO update(UUID id, RoleRequestDTO roleRequestDTO) {
        Optional<Role> optionalRole = roleRepository.findById(id);
        if (optionalRole.isEmpty()) {
            throw new EntityNotFoundException("Role not found is" + id);
        }
        Role role = Role.builder().build();
        return roleConverter.entityToDto(role);
=======
    public RoleRequest update(UUID id, RoleRequest roleRequest) {
        return null;
>>>>>>> b482babb1da77147c320b86f882e7d5b2f48a0c3
    }

    @Override
    public void remove(UUID id) {
        Role role = roleRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Role type not found"));
//        role.setIsDeleted(true);
        roleRepository.save(role);
    }

    @Override
    public void delete(UUID id) {
        roleRepository.deleteById(id);
    }
}
