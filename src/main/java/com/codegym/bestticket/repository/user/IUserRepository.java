package com.codegym.bestticket.repository.user;


import com.codegym.bestticket.entity.user.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IUserRepository extends JpaRepository<User, UUID> {
    User findByUsername(String username);

    User findByEmail(String email);

    Page<User> findAllByIsDeletedFalse(Pageable pageable);

    boolean existsByUsername(String username);

    boolean existsByEmail(String email);
}

