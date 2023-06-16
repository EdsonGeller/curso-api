package br.com.dicadeumdev.API.resources.exceptions;

import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import br.com.dicadeumdev.API.services.exceptions.ObjNotFoundException;

@ControllerAdvice
public class ResourceExceptionHandle {

    @ExceptionHandler(ObjNotFoundException.class)
    public ResponseEntity<StandartError>objectNotFound(ObjNotFoundException ex, HttpServletRequest request){
        StandartError error = new StandartError(LocalDateTime.now(), HttpStatus.NOT_FOUND.value(), ex.getMessage(), request.getRequestURI());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }
}
