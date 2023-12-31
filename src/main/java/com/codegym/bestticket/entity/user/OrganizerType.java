package com.codegym.bestticket.entity.user;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.UUID;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "organizer_types")
public class OrganizerType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String name;
    @Column(name = "is_delete")
    private Boolean isDelete;
    @OneToMany(mappedBy = "organizerTypeId")
    private List<Organizer> organizers;
}
