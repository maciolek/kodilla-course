package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class ArrayOperationsTestSuite {


    public int[] generateArray(int n) {
        Random rn = new Random();
        int listNumbers[] = new int[n];
        for (int i = 0; i < n; i++) {
            int number = rn.nextInt(10);
            listNumbers[i] = number;
        }
        return listNumbers;
    }
    @Test
    public void testGetAverage() {
        //given
        double sum =0.0;
        int numbers[] = generateArray(20);
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
             }
        //when
        double expectedAverage = sum/numbers.length;
        double actulaAverage = ArrayOperations.getAverage(numbers);
        //then
        Assert.assertEquals(expectedAverage,actulaAverage,0);
    }
    @Test
    public void testGetAverageWhenArrayIsEmpty() {
        //given
        double sum =0.0;
        int numbers[] = generateArray(0);
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
             }
        //when
         try {
            double expectedAverage = sum/numbers.length;
            double actulaAverage = ArrayOperations.getAverage(numbers);
            Assert.fail();
        } catch (IllegalArgumentException ex) {
        }
        //then
    }


}
