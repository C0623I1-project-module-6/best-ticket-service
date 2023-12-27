package com.codegym.bestticket.entity.ticket;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String ticket_code;

    private String seat;

    private String time;

    private String location;

    private String promotion;

    private String barcode;

    private String isDelete;

    @ManyToOne
    @JoinColumn(name = "ticketType_id", nullable = false)
    private TicketType ticketType;


}
