package com.codegym.bestticket.controller;

import com.codegym.bestticket.payload.ResponsePayload;
import com.codegym.bestticket.service.IFileEntityService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@AllArgsConstructor
@RequestMapping("/api/test-fire-base")
public class FileEntityController {
    private final IFileEntityService fileEntityService;

    @GetMapping
    public ResponseEntity<ResponsePayload> showFiles() {
        ResponsePayload responsePayload = fileEntityService.findAll();
        return new ResponseEntity<>(responsePayload, responsePayload.getStatus());
    }

    @PostMapping("/upload")
    public ResponseEntity<ResponsePayload> uploadFile(MultipartFile file) {
        ResponsePayload responsePayload = fileEntityService.save(file);
        return new ResponseEntity<>(responsePayload, responsePayload.getStatus());
    }
}
