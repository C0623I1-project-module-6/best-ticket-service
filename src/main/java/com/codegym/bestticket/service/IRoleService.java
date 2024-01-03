package com.codegym.bestticket.service;

import com.codegym.bestticket.dto.user.RoleDto;

import java.util.UUID;

public interface IRoleService {
    RoleDto create(RoleDto roleDto);

    RoleDto update(UUID id, RoleDto roleDto);

    void remove(UUID id);

    void delete(UUID id);
}
