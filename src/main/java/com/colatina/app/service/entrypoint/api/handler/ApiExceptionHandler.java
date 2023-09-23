package com.colatina.app.service.entrypoint.api.handler;

import com.colatina.app.service.core.exception.BusinessException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

@RestControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler(value = BusinessException.class)
    protected ResponseEntity<String> cardNotFoundExceptionHandler(final BusinessException exception) {
        return ResponseEntity.status(BAD_REQUEST.value()).body(exception.getMessage());
    }

}
