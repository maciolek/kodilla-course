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
        for (int i = 0; i < listEven.size(); i++) {
            System.out.println(listEven.get(i));
        }
    }
    public ArrayList<Integer> getListEven() {
        return listEven;
    }
}
