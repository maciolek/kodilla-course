package com.kodilla.stream;

import com.kodilla.stream.lambda.ExecuteSaySomething;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.reference.FunctionalCalculator;
import com.sun.org.apache.xpath.internal.SourceTree;

public class StreamMain {
    public static void main(String[] args) {
// mod 7.1
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
        expressionExecutor.executeExpression(3,3,FunctionalCalculator::divideAByB);
    }
}