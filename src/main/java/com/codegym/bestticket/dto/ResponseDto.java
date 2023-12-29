package com.codegym.bestticket.dto;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;
/*
This object is responsible for transporting data returned on Http
 */
@Data
@Builder
public class ResponseDto {
    private String message;
    private HttpStatus status;
    private Object data;
}
