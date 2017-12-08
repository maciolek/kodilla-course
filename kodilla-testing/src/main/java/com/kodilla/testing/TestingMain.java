package com.kodilla.testing;
import com.kodilla.testing.collection.OddNumbersExterminator;

import java.util.ArrayList;

public class TestingMain {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(10);
        numbers.add(11);
        numbers.add(12);
        numbers.add(13);
        OddNumbersExterminator packNumbers = new OddNumbersExterminator();
        packNumbers.exterminate(numbers);
        packNumbers.show();
    }
}
