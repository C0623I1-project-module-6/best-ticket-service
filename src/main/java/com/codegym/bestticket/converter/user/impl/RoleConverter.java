package com.codegym.bestticket.converter.user.impl;

import com.codegym.bestticket.converter.user.IRoleConverter;
import com.codegym.bestticket.entity.user.Role;
import com.codegym.bestticket.dto.user.RoleDto;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class RoleConverter implements IRoleConverter {
    public RoleDto entityToDto(Role role) {
        RoleDto roleDto = new RoleDto();
        BeanUtils.copyProperties(role, roleDto);
        return roleDto;
    }

    public Role dtoToEntity(RoleDto roleDto) {
        Role role = new Role();
        BeanUtils.copyProperties(roleDto, role);
        return role;
    }
}
