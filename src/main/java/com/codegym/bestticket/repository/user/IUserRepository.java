package com.codegym.bestticket.repository.user;


import com.codegym.bestticket.entity.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IUserRepository extends JpaRepository<User, UUID> {
    User findByPhoneNumber(String phoneNumber);

    User findByEmail(String email);

    boolean existsByPhoneNumber(String phoneNumber);

    boolean existsByUsername(String username);

    boolean existsByEmail(String email);
}

