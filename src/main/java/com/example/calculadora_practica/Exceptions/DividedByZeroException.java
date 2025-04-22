package com.example.calculadora_practica.Exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class DividedByZeroException extends RuntimeException {
  public DividedByZeroException(String message) {
    super(message);
  }
}
