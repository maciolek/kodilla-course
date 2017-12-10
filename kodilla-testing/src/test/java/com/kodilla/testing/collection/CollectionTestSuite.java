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
        Assert.assertEquals(numbers.isEmpty(),listEven.isEmpty());
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
        ArrayList<Integer> expectedNumbers = new ArrayList<Integer>();
        //Arrays.asList(2,4,10,12);
        expectedNumbers.add(2);
        expectedNumbers.add(4);
        expectedNumbers.add(10);
        expectedNumbers.add(12);

//then
//      Assert.assertTrue(testEvenList.size()==listEven.size());
        Assert.assertEquals(expectedNumbers, listEven);
}
}
