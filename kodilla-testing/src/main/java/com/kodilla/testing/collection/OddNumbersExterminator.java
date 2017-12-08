package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.lang.*;


public class OddNumbersExterminator {
    ArrayList<Integer> listEven;
    public OddNumbersExterminator() {
        listEven = new ArrayList<Integer>();
    }

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        for (Integer currentNumber : numbers)
            if (currentNumber % 2 == 0) {
                listEven.add(currentNumber);
            }
        return listEven;
    }

    public void show() {
        System.out.println("Liczby parzyste dodane do listy: ");
        for (int i = 0; i < listEven.size(); i++) {
            System.out.print(listEven.get(i));
            System.out.print(" ");
        }
    }
    public ArrayList<Integer> getListEven() {
        return listEven;
    }
}
