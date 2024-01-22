package com.codegym.bestticket.entity.user;

import com.codegym.bestticket.entity.event.Event;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "organizers")
public class Organizer {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column(length = 50,nullable = false)
    private String name;
    @Column(length = 50, nullable = false, unique = true)
    private String phoneNumber;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(length = 50, unique = true)
    private String idCard;
    @Column(length = 50, unique = true)
    private String taxCode;
    @Column(length = 50, unique = true)
    private String businessCode;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Temporal(TemporalType.DATE)
    @Column(length = 20,nullable = false)
    private Date dateRange;
    @Column(length = 50, nullable = false)
    private String issuedBy;
    @ManyToOne
    @JoinColumn(name = "organizer_type_id")
    @JsonIgnore
    private OrganizerType organizerType;
    private Boolean isDeleted;
    @OneToOne
    @JoinColumn(name = "user_id", unique = true)
    @JsonIgnore
    private User user;
    @OneToMany(mappedBy = "organizer")
    private List<Event> events;

}
