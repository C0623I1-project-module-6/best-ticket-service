package com.codegym.bestticket.service;

import com.codegym.bestticket.payload.request.user.RoleRequest;

import java.util.UUID;

public interface IRoleService {
    RoleRequest create(RoleRequest roleRequest);

    RoleRequest update(UUID id, RoleRequest roleRequest);

    void remove(UUID id);

    void delete(UUID id);
}
