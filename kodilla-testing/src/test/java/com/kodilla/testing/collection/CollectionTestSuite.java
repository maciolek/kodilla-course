package com.kodilla.testing.collection;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

class CollectionTestSuite {
    int i = 0;

    @Before
    public void before() {

        System.out.println("Start testu" + i);
        i++;
    }
    @After
    public void after() {
        System.out.println("Koniec testu " + i);
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
//given
        System.out.println("Start testu - testOddNumbersExterminatorEmptyList");
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

//when
        numbers.clear();
        ArrayList<Integer> listEven = packNumbers.getListEven();


//then
        Assert.assertTrue((numbers.size() == 0) && (listEven.size() == 0));
        System.out.println("Koniec testu - testOddNumbersExterminatorEmptyList");
    }
}
