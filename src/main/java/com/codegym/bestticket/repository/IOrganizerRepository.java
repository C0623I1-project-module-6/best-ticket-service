package com.codegym.bestticket.repository;

import com.codegym.bestticket.entity.user.Organizer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface IOrganizerRepository extends JpaRepository<Organizer, UUID> {
    List<Organizer> findAllByIsDeleteFalse();
    Organizer findByIdAndIsDeleteFalse(UUID id);
}
