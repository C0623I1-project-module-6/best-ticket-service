package com.codegym.bestticket.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
/*
This object is responsible for transporting data returned on Http
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponseDto {
    private String message;
    private HttpStatus status;
    private Object data;

    public ResponseDto(Object data) {
        this.data = data;
    }

    public ResponseDto(String message, HttpStatus status) {
        this.message = message;
        this.status = status;
    }
}
