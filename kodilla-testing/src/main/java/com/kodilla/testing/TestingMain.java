package com.kodilla.testing;
import com.kodilla.testing.collection.OddNumbersExterminator;
import java.util.Arrays;
import java.util.List;

public class TestingMain {

    public static void main(String[] args) {

      List<Integer> numbers = Arrays.asList(1,2,3,4,10,11,12,13,14);
      OddNumbersExterminator packNumbers = new OddNumbersExterminator();
      packNumbers.exterminate(numbers);
    }
}
