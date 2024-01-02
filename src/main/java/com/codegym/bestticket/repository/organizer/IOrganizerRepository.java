package com.codegym.bestticket.repository.organizer;

import com.codegym.bestticket.entity.organizer.Organizer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface IOrganizerRepository extends JpaRepository<Organizer, UUID> {
    List<Organizer> findAllByIsDeletedFalse();
    Organizer findByIdAndIsDeletedFalse(UUID id);
}
