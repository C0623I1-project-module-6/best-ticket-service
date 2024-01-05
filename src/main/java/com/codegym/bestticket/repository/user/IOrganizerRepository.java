package com.codegym.bestticket.repository.user;


import com.codegym.bestticket.entity.user.Organizer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface IOrganizerRepository extends JpaRepository<Organizer, UUID> {
    Page<Organizer> findAllByIsDeletedFalse(Pageable pageable);

    Page<Organizer> findAllByNameContainingOrEmailContainingAndIsDeletedFalse(Pageable pageable, String keyword);

    Optional<Organizer> findByIdAndIsDeletedFalse(UUID id);

    Optional<Organizer> findByUserIdAndIsDeletedFalse(UUID id);
}
