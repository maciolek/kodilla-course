package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.lang.*;
import java.util.List;

public class OddNumbersExterminator {

    public ArrayList<Integer> exterminate(List<Integer> numbers) {
        ArrayList<Integer> listEven = new ArrayList<Integer>();
        for (Integer currentNumber : numbers) {
            if (currentNumber % 2 == 0) {
                listEven.add(currentNumber);
            }
        }
        return listEven;
    }
}
