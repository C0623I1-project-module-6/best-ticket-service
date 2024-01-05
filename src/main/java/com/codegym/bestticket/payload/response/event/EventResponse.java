package com.codegym.bestticket.payload.response.event;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EventResponse {
    private Object data;
    private HttpStatus httpStatus= HttpStatus.OK;
    private String message;
}
