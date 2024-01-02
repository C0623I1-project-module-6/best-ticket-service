package com.codegym.bestticket.dto.response.event_type;

import com.codegym.bestticket.dto.EventTypeDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EventTypeResponse {
    private List<EventTypeDTO> eventTypeList;
    private EventTypeDTO eventType;
    private String message;
}
