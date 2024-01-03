package com.codegym.bestticket.repository.event;

import com.codegym.bestticket.entity.event.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;


public interface IEventRepository extends JpaRepository<Event, UUID> {
    List<Event> findAllByIsDeletedFalse();

    Event findByIdAndIsDeletedFalse(UUID event_id);


}
