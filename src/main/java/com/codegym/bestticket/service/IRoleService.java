package com.codegym.bestticket.service;

import com.codegym.bestticket.dto.RoleDTO;

import java.util.UUID;

public interface IRoleService {
    RoleDTO create(RoleDTO roleDTO);

    RoleDTO update(UUID id, RoleDTO roleDTO);

    void remove(UUID id);

    void delete(UUID id);
}
