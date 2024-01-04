package com.codegym.bestticket.dto.event;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
public class EventTypeDTO {
    private UUID id;
    private String name;
}
