package com.codegym.bestticket.repository.organizer;

import com.codegym.bestticket.entity.user.OrganizerType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IOrganizerTypeRepository extends JpaRepository<OrganizerType, UUID> {
}
