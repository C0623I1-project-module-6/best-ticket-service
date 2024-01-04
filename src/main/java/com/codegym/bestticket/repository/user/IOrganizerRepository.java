package com.codegym.bestticket.repository.user;


import com.codegym.bestticket.entity.user.Organizer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface IOrganizerRepository extends JpaRepository<Organizer, UUID> {
    List<Organizer> findAllByIsDeletedFalse();

    Organizer findByIdAndIsDeletedFalse(UUID id);

    Optional<Organizer> findByUserIdAndIsDeletedFalse(UUID id);
}
