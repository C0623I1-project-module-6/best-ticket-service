package com.codegym.bestticket.converter.user;

import com.codegym.bestticket.payload.request.user.RoleRequest;
import com.codegym.bestticket.entity.user.Role;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class RoleConverter {
    public RoleRequest entityToDto(Role role) {
        RoleRequest roleRequest = new RoleRequest();
        BeanUtils.copyProperties(role, roleRequest);
        return roleRequest;
    }

    public Role dtoToEntity(RoleRequest roleRequest) {
        Role role= new Role();
        BeanUtils.copyProperties(roleRequest, role);
        return role;
    }
}
