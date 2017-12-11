package com.kodilla.testing.com.kodilla.testing.shape;

import java.util.ArrayList;


public class ShapeCollector {

    public ArrayList<Shape> shapesList = new ArrayList<Shape>();

    public void addFigure(Shape shape) {
        shapesList.add(shape);
    }

    public void removeFigure(Shape shape) {
        shapesList.remove(shape);
    }

    public Shape getFigure(int n) {
        Shape getFigure = shapesList.get(n);
        return getFigure;
    }

    public void showFigures() {
        System.out.println("Shapes with fields: ");
        for (Shape currentShape : shapesList) {
            System.out.println(currentShape.getShapeName() + " " + currentShape.getField());
        }
    }
}
