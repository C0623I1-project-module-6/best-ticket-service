package com.codegym.bestticket.service.impl;

import com.codegym.bestticket.entity.FileEntity;
import com.codegym.bestticket.payload.ResponsePayload;
import com.codegym.bestticket.repository.IFileEntityRepository;
import com.codegym.bestticket.service.IFileEntityService;
import com.google.cloud.storage.Blob;
import com.google.cloud.storage.Bucket;
import com.google.firebase.cloud.StorageClient;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

@Service
@AllArgsConstructor
public class FileEntityService implements IFileEntityService {
    private final IFileEntityRepository iFileEntityRepository;

    public ResponsePayload createFileEntityPayload(String message, HttpStatus status, Object data) {
        return ResponsePayload.builder().message(message).status(status).data(data).build();
    }

    @Override
    public ResponsePayload findAll() {
        List<FileEntity> fileEntityList = iFileEntityRepository.findAll();
        return createFileEntityPayload("Success", HttpStatus.OK, fileEntityList);
    }

    @Override
    public ResponsePayload save(MultipartFile file) {
        try {
            Bucket bucket = StorageClient.getInstance().bucket();
            byte[] fileBytes = file.getBytes();
            Blob blob = bucket.create(file.getOriginalFilename(), fileBytes, file.getContentType());
            System.out.println(blob);

            String downloadToken = generateDownloadToken();
            String downloadUrl = generateDownloadUrl(bucket.getName(), file.getOriginalFilename(), downloadToken);

            FileEntity fileEntity = new FileEntity();
            fileEntity.setFileName(file.getOriginalFilename());
            fileEntity.setFileType(file.getContentType());
            fileEntity.setUrl(downloadUrl);
            iFileEntityRepository.save(fileEntity);
            return createFileEntityPayload("Upload successfully.", HttpStatus.OK, fileEntity);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private String generateDownloadToken() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }

    private String generateDownloadUrl(String bucketName, String fileName, String downloadToken) {
        String downloadUrlFormat = "https://firebasestorage.googleapis.com/v0/b/%s/o/%s?alt=media&token=%s";
        return String.format(downloadUrlFormat, bucketName, fileName, downloadToken);
    }

    @Override
    public ResponsePayload findById(Long id) {
        return null;
    }
}
