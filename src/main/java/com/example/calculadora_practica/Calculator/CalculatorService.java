package com.example.calculadora_practica.Calculator;


import com.example.calculadora_practica.Exceptions.DividedByZeroException;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public Double resta(Double a, Double b) {
        return a - b;
    }

    public Double suma(Double a, Double b) {
        return a + b;
    }

    public Double multiplica(Double a, Double b) {
        return a * b;
    }

    public Double division(Double a, Double b) {
        if(b==0){
            throw new DividedByZeroException("El denominador no puede ser " + b + " intente cambiando el denominador.");
        }
        return a / b;
    }
}
