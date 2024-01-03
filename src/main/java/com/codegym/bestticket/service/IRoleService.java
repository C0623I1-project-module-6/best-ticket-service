package com.codegym.bestticket.service;

import com.codegym.bestticket.dto.request.user.RoleRequestDTO;

import java.util.UUID;

public interface IRoleService {
    RoleRequestDTO create(RoleRequestDTO roleRequestDTO);

    RoleRequestDTO update(UUID id, RoleRequestDTO roleRequestDTO);

    void remove(UUID id);

    void delete(UUID id);
}
