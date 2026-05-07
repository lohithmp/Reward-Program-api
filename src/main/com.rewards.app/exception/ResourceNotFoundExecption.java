package com.rewards.app.exception;

/**
 * Custom exception class.
 */
public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(String message) {
        super(message);
    }
}