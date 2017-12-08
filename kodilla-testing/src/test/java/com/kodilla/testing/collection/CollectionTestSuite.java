package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionTestSuite {

    @Before
    public void before() {

        System.out.println("Start testu Collection ");
    }

    @After
    public void after() {
        System.out.println("Koniec testu Collection ");

    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
//given
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        OddNumbersExterminator packNumbers = new OddNumbersExterminator();
        packNumbers.exterminate(numbers);

//when
        ArrayList<Integer> listEven = packNumbers.getListEven();
//then
        Assert.assertTrue(numbers.isEmpty() && listEven.isEmpty());
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
//given

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
//when
        ArrayList<Integer> listEven = packNumbers.getListEven();
        ArrayList<Integer> testEvenList = new ArrayList<Integer>();
        for (Integer currentNumber : numbers) {
            if (currentNumber % 2 == 0) {
                testEvenList.add(currentNumber);
            }
        }
//then
//      Assert.assertTrue(testEvenList.size()==listEven.size());
        Assert.assertEquals(testEvenList, listEven);
    }
}
