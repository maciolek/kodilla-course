package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class Display {

    public boolean displayValue(double val){
        System.out.println("Wynik wynosi: " + val);
        return true;
    }
}
