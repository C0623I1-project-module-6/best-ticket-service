package com.codegym.bestticket.entity.booking;

import com.codegym.bestticket.entity.ticket.Ticket;
import com.fasterxml.jackson.annotation.JsonIgnore;
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

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@Builder
@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "contract_details")
public class BookingDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "contract_id", nullable = false)
    private Booking booking;
    @OneToMany(mappedBy = "contractDetail")
    @JsonIgnore
    private List<Ticket> tickets;
    private Boolean isDeleted;
}
