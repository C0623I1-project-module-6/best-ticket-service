package com.codegym.bestticket.converter.user;

import com.codegym.bestticket.payload.request.user.RoleRequestDTO;
import com.codegym.bestticket.entity.user.Role;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class RoleConverter {
    public RoleRequestDTO entityToDto(Role role) {
        RoleRequestDTO roleRequestDTO = new RoleRequestDTO();
        BeanUtils.copyProperties(role, roleRequestDTO);
        return roleRequestDTO;
    }

    public Role dtoToEntity(RoleRequestDTO roleRequestDTO) {
        Role role= new Role();
        BeanUtils.copyProperties(roleRequestDTO, role);
        return role;
    }
}
