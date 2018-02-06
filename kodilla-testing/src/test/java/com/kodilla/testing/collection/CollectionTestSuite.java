package com.kodilla.testing.collection;

import org.hamcrest.CoreMatchers;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

public class CollectionTestSuite {
    private static int counter;

    @Before
    public void before() {
        System.out.println("Start testu Collection " + counter);
    }
    @After
    public void after() {
        System.out.println("Koniec testu Collection " + counter);
        counter++;
    }
    @Test
    public void testOddNumbersExterminatorEmptyList() {
//given
        List<Integer> numbers = Arrays.asList();
        OddNumbersExterminator packNumbers = new OddNumbersExterminator();
        packNumbers.exterminate(numbers);
//when
        List<Integer> listEven = packNumbers.exterminate(numbers);
//then
        Assert.assertEquals(numbers.isEmpty(), listEven.isEmpty());
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
//given
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 10, 11, 12, 13, 14);
        OddNumbersExterminator packNumbers = new OddNumbersExterminator();
        packNumbers.exterminate(numbers);
//when
        List<Integer> listEven = packNumbers.exterminate(numbers);
//then
  //      Assert.assertThat(listEven, CoreMatchers.hasItems(2, 4, 10, 12, 14));
    }
}
