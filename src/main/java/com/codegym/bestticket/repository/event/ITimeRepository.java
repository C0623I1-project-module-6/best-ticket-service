package com.codegym.bestticket.repository.event;

import com.codegym.bestticket.entity.event.Time;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.UUID;

public interface ITimeRepository extends JpaRepository<Time, UUID> {
    Time findByTime(LocalDateTime startDateTime);
}
