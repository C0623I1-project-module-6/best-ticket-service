package com.codegym.bestticket.repository.user;

import com.codegym.bestticket.entity.user.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IUserRoleRepository extends JpaRepository<UserRole, UUID> {
}
