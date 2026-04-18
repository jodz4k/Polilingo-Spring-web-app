package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(String resourceName, int id) {
        super(resourceName + " with id " + id + " not found");
    }

    public ResourceNotFoundException(String message) {
        super(message);
    }
}
