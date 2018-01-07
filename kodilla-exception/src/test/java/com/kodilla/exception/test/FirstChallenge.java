package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {

        if (b == 0) {
            throw new ArithmeticException("You can not divide by zero");
        }
        return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     *
     * @param args
     */
    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        try {

            double result = firstChallenge.divide(3, 0);
            System.out.println(result);

        } catch (ArithmeticException ex) {

            System.out.println("Exeption: " + ex);
            
        } finally {

            System.out.println("Działanie programu zakończone");
        }


    }
}