package com.codegym.bestticket.dto.event;

import lombok.Data;

import java.util.UUID;

@Data
public class EventTypeDTO {
    private UUID id;
    private String name;
}
