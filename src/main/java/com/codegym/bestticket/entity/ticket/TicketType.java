package com.codegym.bestticket.entity.ticket;

import jakarta.persistence.*;

import java.util.Set;
import java.util.UUID;

@Entity
public class TicketType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String name;

    private Double price;

    private Boolean isDelete;

    @OneToMany(mappedBy = "ticketType")
    private Set<Ticket> tickets;

    public TicketType() {
    }

    public TicketType(String name, Double price, Boolean isDelete, Set<Ticket> tickets) {
        this.name = name;
        this.price = price;
        this.isDelete = isDelete;
        this.tickets = tickets;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Set<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(Set<Ticket> tickets) {
        this.tickets = tickets;
    }

    public Boolean getDelete() {
        return isDelete;
    }

    public void setDelete(Boolean delete) {
        isDelete = delete;
    }
}
