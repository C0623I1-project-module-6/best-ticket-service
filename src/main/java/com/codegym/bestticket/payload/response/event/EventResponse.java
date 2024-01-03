package com.codegym.bestticket.payload.response.event;

import com.codegym.bestticket.dto.EventDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EventResponse {
    private List<EventDTO> eventDTOS;
    private EventDTO eventDTO;
    private String message;
}
