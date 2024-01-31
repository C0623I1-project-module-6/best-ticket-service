package com.codegym.bestticket.repository.event;

import com.codegym.bestticket.entity.event.Time;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;
import java.util.UUID;

public interface ITimeRepository extends JpaRepository<Time, UUID> {
    Time findByTime(LocalDateTime startDateTime);

    //    @Query("SELECT t FROM Time t JOIN t.eventTimes et JOIN et.event e WHERE e.id = :eventId")
//    List<Time> findTimesByEventId(@Param("eventId") UUID eventId);
    @Query("SELECT t FROM Time t JOIN t.events e  WHERE e.id = :eventId")
    Page<Time> findTimesByEventId(UUID eventId, Pageable pageable);
}
