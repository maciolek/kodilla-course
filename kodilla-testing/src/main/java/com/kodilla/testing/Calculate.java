package com.kodilla.testing;

public class Calculate {

    private int numberOne;
    private int numberTwo;

    public Calculate(int numberOne, int numberTwo) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }

    public int addNumber() {
        return numberOne + numberTwo;
    }

    public int substractNumber() {
        return numberOne - numberTwo;
    }

    public int getNumberOne() {
        return numberOne;
    }

    public int getNumberTwo() {
        return numberTwo;
    }
}

