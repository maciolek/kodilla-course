package com.kodilla.stream;

import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.world.Continent;
import com.kodilla.stream.world.Country;

import java.math.BigDecimal;

public class StreamMain {
    public static void main(String[] args) {

        Country country1 = new Country("Asia", "Japonia", new BigDecimal("127000000"));
        Country country2 = new Country("Asia", "Chiny", new BigDecimal("1397000000"));
        Country country3 = new Country("Europe", "Francja", new BigDecimal("66700000"));
        Country country4 = new Country("Europe", "Polska", new BigDecimal("37950000"));
        Country country5 = new Country("Africa", "Kamerun", new BigDecimal("24000000"));
        Country country6 = new Country("Africa", "Egipt", new BigDecimal("96000000"));

        }
}

/*        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);*/


/*        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("\nNauka JAVA to sama przyjemność! :-D",String::toUpperCase);
        poemBeautifier.beautify("Nauka JAVY zajmuje mnóstwo czasu!", MyBeautyfier::beautifierAddLineInHash);
        poemBeautifier.beautify("Umiem coraz wiecej", (text) -> MyBeautyfier.beautifierOneLineOneChar(text));
        */


/*// mod 7.1
        Processor processor = new Processor();
        ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();
        processor.execute(executeSaySomething);
// lambda 1 bez objektu klasy pośredniczącej!
//        Executor executor = () -> System.out.println("0This is an example text - lambda 1");
//        processor.executor(executor);
//lambda 2 bez tworzenia zmiennej :-)
//        processor.execute (()-> System.out.println("This is an example text - lambda 2"));
//lambda z argumentami 3
//        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
//        expressionExecutor.executeExpression(5,5,  (a, b) -> a + b);
//        expressionExecutor.executeExpression(10,8, (a, b) -> a - b);
//        expressionExecutor.executeExpression(20,5, (a, b) -> a / b);
//        expressionExecutor.executeExpression(3,3,(a, b) -> a * b);
//lambda z referencjami 4
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        expressionExecutor.executeExpression(5,5, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(10,8, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(20,5, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3,3,FunctionalCalculator::divideAByB);*/
