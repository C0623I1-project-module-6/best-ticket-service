package com.codegym.bestticket.service;

import com.codegym.bestticket.dto.user.RoleDto;
import com.codegym.bestticket.payload.ResponsePayload;

import java.util.UUID;

public interface IRoleService {
    ResponsePayload create(RoleDto roleDto);

    ResponsePayload update(UUID id, RoleDto roleDto);

    ResponsePayload delete(UUID id);


}
