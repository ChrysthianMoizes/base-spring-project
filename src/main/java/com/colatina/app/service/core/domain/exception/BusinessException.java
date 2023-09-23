package com.colatina.app.service.core.domain.exception;

public class BusinessException extends RuntimeException {
    public BusinessException(final String message) {
        super(message);
    }
}
