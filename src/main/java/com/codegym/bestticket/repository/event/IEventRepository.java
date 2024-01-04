package com.codegym.bestticket.repository.event;

import com.codegym.bestticket.entity.event.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;
import java.util.UUID;
public interface IEventRepository extends JpaRepository<Event, UUID> {
    List<Event> findAllByIsDeletedFalse();

    Event findByIdAndIsDeletedFalse(UUID event_id);

    List<Event> findByNameContainingAndIsDeletedFalse(String text);

    @Query("SELECT e FROM Event e JOIN e.eventTypes et WHERE et.name IN :eventTypeNames AND e.isDeleted = false")
    List<Event> findByEventTypeNamesAndIsDeletedFalse(@Param("eventTypeNames") List<String> eventTypeNames);

}
