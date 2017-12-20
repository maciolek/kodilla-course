package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(int[] numbers) {
        if (numbers.length!=){
        IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .forEach((n) -> System.out.println(n));

        double average = IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .average()
                .getAsDouble();
        System.out.println("Average= " + average );

        return average;

}
