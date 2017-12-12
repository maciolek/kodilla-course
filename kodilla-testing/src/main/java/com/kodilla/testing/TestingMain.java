package com.kodilla.testing;

import com.kodilla.testing.com.kodilla.testing.shape.*;

import java.util.Arrays;

public class TestingMain {
    public static void main(String[] args) {

        ShapeCollector objShapeCollector = new ShapeCollector();
        Shape circle1 = new Circle(2.0);
        Shape square1 = new Square(5.0);
        Shape tringle1 = new Triangle(5.0, 8.0);
        objShapeCollector.addFigure(circle1);
        objShapeCollector.addFigure(square1);
        objShapeCollector.addFigure(tringle1);
        objShapeCollector.removeFigure(circle1);

        System.out.println(objShapeCollector.showFigures());
        System.out.println(objShapeCollector.shapesListSize());

    }
}

