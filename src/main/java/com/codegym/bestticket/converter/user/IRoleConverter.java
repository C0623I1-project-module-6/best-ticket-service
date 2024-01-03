package com.codegym.bestticket.converter.user;

import com.codegym.bestticket.entity.user.Role;
import com.codegym.bestticket.dto.user.RoleDto;

public interface IRoleConverter {
    RoleDto entityToDto(Role role);

    Role dtoToEntity(RoleDto roleDto);
}
