package com.codegym.bestticket.dto.mail;

import lombok.Data;

import java.util.Map;

@Data
public class DataMailDto {
    private String to;
    private String subject;
    private String content;
    private Map<String, Object> props;
}
