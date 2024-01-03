package com.codegym.bestticket.repository.user;

import com.codegym.bestticket.entity.user.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IRoleRepository extends JpaRepository<Role, UUID> {
}
