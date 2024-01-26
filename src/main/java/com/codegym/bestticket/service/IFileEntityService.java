package com.codegym.bestticket.service;

import com.codegym.bestticket.payload.ResponsePayload;
import org.springframework.web.multipart.MultipartFile;

public interface IFileEntityService {
    ResponsePayload findAll();

    ResponsePayload save(MultipartFile file);

    ResponsePayload findById(Long id);
}
