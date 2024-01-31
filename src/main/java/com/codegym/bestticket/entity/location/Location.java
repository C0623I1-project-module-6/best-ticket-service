package com.codegym.bestticket.entity.location;

import com.codegym.bestticket.entity.event.Event;
import com.fasterxml.jackson.annotation.JsonIgnore;
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

    private String address;
    @OneToMany(mappedBy = "location")
    @JsonIgnore
    private List<Event> events;
}
