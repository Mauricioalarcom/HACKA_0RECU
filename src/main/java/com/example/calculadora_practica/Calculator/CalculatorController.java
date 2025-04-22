package com.example.calculadora_practica.Calculator;

import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class CalculatorController {

    @Autowired
    private CalculatorService service;

    @GetMapping("/resta/{a}/{b}")
    public Double resta(@PathVariable double a, @PathVariable double b) {
        return service.resta(a,b);
    }

    @GetMapping("/suma/{a}/{b}")
    public Double suma(@PathVariable double a, @PathVariable double b) {
        return service.suma(a,b);
    }

    @GetMapping("/multiplica/{a}/{b}")
    public Double multiplica(@PathVariable double a, @PathVariable double b) {
        return service.multiplica(a,b);
    }

    @GetMapping("/divide/{a}/{b}")
    public Double divide(@PathVariable double a, @PathVariable double b) {
        return service.division(a,b);
    }

}
