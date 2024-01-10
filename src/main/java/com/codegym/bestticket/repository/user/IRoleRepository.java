package com.codegym.bestticket.repository.user;

import com.codegym.bestticket.entity.user.Role;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface IRoleRepository extends JpaRepository<Role, UUID> {
    Page<Role> searchUserByIsDeletedFalseAndNameContaining(Pageable pageable, String status);

    Optional<Role> findByName(String name);


    Optional<Role> findById(UUID id);
}
