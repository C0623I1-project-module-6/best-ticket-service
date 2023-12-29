package com.codegym.bestticket.repository;

import com.codegym.bestticket.entity.event.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface IEventRepository extends JpaRepository<Event, UUID> {
    List<Event> findAllByIsDeletedFalse();
    Event findByIdAndIsDeletedFalse(UUID event_id);


}