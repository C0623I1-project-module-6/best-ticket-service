package com.codegym.bestticket.entity.event;

import com.codegym.bestticket.entity.ticket.Ticket;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;
import java.util.UUID;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "event_times")
public class EventTime {

    @Id
    @ManyToOne
    @JoinColumn(name = "event_id", referencedColumnName = "id")
    private Event event;

    @Id
    @ManyToOne
    @JoinColumn(name = "time_id", referencedColumnName = "id")
    private Time time;

    @OneToMany(mappedBy = "eventTime")
    private Set<Ticket> tickets;
}
