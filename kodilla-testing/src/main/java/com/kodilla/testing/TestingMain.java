package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;


public class TestingMain {

    public static void main(String[] args) {
        System.out.println("Moduł 6. Wprowadzenie do testowania oprogramowania.");

        SimpleUser user = new SimpleUser("Maciej");

        String test = user.getUserName();

        if (test.equals("Maciej")) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test error!");
        }
// test modułu calculator

        System.out.println("\nTest kalkulator - ZADANIE 6.2 \n ");
        Calculate result = new Calculate(5, 5);

        Integer numberOne = result.getNumberOne();
        Integer numberTwo = result.getNumberTwo();

        Integer addTest = result.addNumber();
        Integer substTest = result.substractNumber();

// test add
        if (addTest.equals((numberOne + numberTwo))) {
            System.out.println("Test dodawania OK");
        } else {
            System.out.println("Test dodawania error!");
        }
// test substract
        if (substTest.equals((numberOne - numberTwo))) {
            System.out.println("Test odejmowania OK");
        } else {
            System.out.println("Test odejmowania error!");
        }

    }
}
