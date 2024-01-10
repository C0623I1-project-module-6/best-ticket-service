package com.codegym.bestticket.entity.location;

import com.codegym.bestticket.entity.event.Event;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "LOCATIONS")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String province;

    private String district;

    @OneToMany(mappedBy = "location")
    private List<Event> events;
}