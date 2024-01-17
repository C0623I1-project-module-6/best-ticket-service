package com.codegym.bestticket.entity.event;

import com.codegym.bestticket.entity.location.Location;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
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
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;
    private String description;
    private String image;
    private String duration;
    private Integer ticketAmount;

    @Column(columnDefinition = "boolean default false")
    private Boolean isDeleted;
    private String status;

    @ManyToMany
    @JoinTable(
            name = "event_event_types",
            joinColumns = @JoinColumn(name = "event_id"),
            inverseJoinColumns = @JoinColumn(name = "event_type_id"))
    private Set<EventType> eventTypes;

    @ManyToMany
    @JoinTable(
            name = "event_times",
            joinColumns = @JoinColumn(name = "event_id"),
            inverseJoinColumns = @JoinColumn(name = "time_id"))
    @JsonIgnore
    private Set<Time> times;

    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;
}
