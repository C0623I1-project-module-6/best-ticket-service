package com.codegym.bestticket.repository;

import com.codegym.bestticket.entity.RefreshToken;
import com.codegym.bestticket.entity.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;

import java.util.Optional;
import java.util.UUID;

public interface IRefreshTokenRepository extends JpaRepository<RefreshToken, UUID> {
    Optional<RefreshToken> findByRefreshToken(String token);
    @Modifying
    int deleteByUser(User user);
}
