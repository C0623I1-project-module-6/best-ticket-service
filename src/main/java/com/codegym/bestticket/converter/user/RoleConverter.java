package com.codegym.bestticket.converter.user;

import com.codegym.bestticket.dto.RoleDTO;
import com.codegym.bestticket.entity.user.Role;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class RoleConverter {
    public RoleDTO entityToDto(Role role) {
        RoleDTO roleDTO = new RoleDTO();
        BeanUtils.copyProperties(role, roleDTO);
        return roleDTO;
    }

    public Role dtoToEntity(RoleDTO roleDTO) {
        Role role= new Role();
        BeanUtils.copyProperties(roleDTO, role);
        return role;
    }
}
