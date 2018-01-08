package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {

            secondChallenge.probablyIWillThrowException(2.0, 5.0);

        } catch (Exception e) {

            System.out.println("Exception " + e + " caught!");

        } finally {

            System.out.println("The end");
        }


    }
}
