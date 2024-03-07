package com.codegym.bestticket.service;

import com.codegym.bestticket.payload.ResponsePayload;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.UUID;

public interface IFileEntityService {
    ResponsePayload findAll();

    ResponsePayload save(MultipartFile file);

    ResponsePayload findById(UUID id);
}
