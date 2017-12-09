package com.kodilla.testing;
import com.kodilla.testing.collection.OddNumbersExterminator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static java.util.Arrays.asList;

public class TestingMain {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = Arrays.asList(1,2,3,4,10,11,12,13);

/*      numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(10);
        numbers.add(11);
        numbers.add(12);
        numbers.add(13);
        OddNumbersExterminator packNumbers = new OddNumbersExterminator();
        packNumbers.exterminate(numbers);*/
        System.out.println("wielkość: " + numbers.size());
    }
}
