package com.kodilla.testing;

import com.kodilla.testing.com.kodilla.testing.shape.Circle;
import com.kodilla.testing.com.kodilla.testing.shape.ShapeCollector;
import com.kodilla.testing.com.kodilla.testing.shape.Square;



public class TestingMain {
    public static void main(String[] args) {

        ShapeCollector objShapeCollector = new ShapeCollector();
        objShapeCollector.addFigure(new Circle(2.0));
        objShapeCollector.addFigure(new Square(5.0));
        objShapeCollector.showFigures();
    }
}

