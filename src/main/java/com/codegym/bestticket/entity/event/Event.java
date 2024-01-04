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
@Table(name = "EVENTS")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name="description")
    private String description;

    @Column(name = "image")
    private String image;

    @Column(name="duration")
    private String duration;

    @Column(name="is_deleted")
    private Boolean isDeleted;

    @ManyToMany
    @JoinTable(
            name = "event_event_type",
            joinColumns = @JoinColumn(name = "event_id"),
            inverseJoinColumns = @JoinColumn(name = "event_type_id"))
    private Set<EventType> eventTypes;

    @ManyToMany
    @JoinTable(
            name = "event_time",
            joinColumns = @JoinColumn(name = "event_id"),
            inverseJoinColumns = @JoinColumn(name = "time_id"))
    private Set<Time> times;
}
