package com.codegym.bestticket.repository.event;

import com.codegym.bestticket.entity.event.Event;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import org.springframework.data.domain.Pageable;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
public interface IEventRepository extends JpaRepository<Event, UUID> {

    Page<Event> findAllByIsDeletedFalse(Pageable pageable);

    Event findByIdAndIsDeletedFalse(UUID eventId);

    Page<Event> findByNameContainingAndIsDeletedFalse(String text,Pageable pageable);

    @Query("SELECT e FROM Event e JOIN e.eventTypes et WHERE et.name IN :eventTypeNames AND e.isDeleted = false")
    Page<Event> findByEventTypeNamesAndIsDeletedFalse(@Param("eventTypeNames") List<String> eventTypeNames, Pageable pageable);

    @Query("SELECT e FROM Event e JOIN e.eventTypes et WHERE e.name LIKE %:text% AND et.name IN :eventTypeNames AND e.isDeleted = false")
    Page<Event> findByTextAndEventTypeNames(@Param("text") String text, @Param("eventTypeNames") List<String> eventTypeNames, Pageable pageable);

    //    @Query("SELECT e FROM Event e JOIN e.location l WHERE e.name LIKE %:text% AND l.province = :province AND e.status = 'ACTIVE' AND e.isDeleted = false")
    @Query("SELECT e FROM Event e JOIN e.location l WHERE e.name LIKE %:text% AND l.province = :province AND e.isDeleted = false")
    Page<Event> findByTextAndLocationProvince(@Param("text") String text, @Param("province") String province, Pageable pageable);

    @Query("SELECT e FROM Event e " +
            "JOIN e.location l " +
            "JOIN e.eventTypes et " +
            "JOIN e.times t " +
            "WHERE (:searchTerm IS NULL OR e.name LIKE %:searchTerm%) " +
            "AND (:province IS NULL OR l.province = :province) " +
            "AND (:eventTypeNames IS NULL OR et.name IN :eventTypeNames) " +
            "AND (:time IS NULL OR t.time > :time) " +
            "AND e.status = 'ACTIVE' " +
            "AND e.isDeleted = false")
    Page<Event> findBySearchCriteria(
            @Param("searchTerm") String searchTerm,
            @Param("province") String province,
            @Param("eventTypeNames") List<String> eventTypeNames,
            @Param("time") LocalDateTime time,
            Pageable pageable);

    Page<Event> findByOrganizer_IdAndIsDeletedFalse(UUID id,Pageable pageable);
}