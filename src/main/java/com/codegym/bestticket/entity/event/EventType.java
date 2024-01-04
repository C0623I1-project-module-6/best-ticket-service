package com.codegym.bestticket.entity.event;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;
import java.util.UUID;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "EVENT_TYPES")
public class EventType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @Column(name = "name")
    private String name;

    @ManyToMany(mappedBy = "eventTypes")
    private Set<Event> events;
}
