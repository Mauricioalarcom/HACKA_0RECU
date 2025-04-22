package com.example.calculadora_practica;


import com.example.calculadora_practica.Exceptions.DividedByZeroException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(DividedByZeroException.class)
    public ResponseEntity<String> handleException(DividedByZeroException e) {
        return ResponseEntity.internalServerError().body(e.getMessage());
    }

}
