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
    public Shape getFigure(int indexNumber) {
        return null;
    }
    public void showFigures() {
        for (int i = 0; i < shapesList.size(); i++) {
            System.out.println(shapesList.get(i).getShapeName() + " - field: " + shapesList.get(i).getField());
        }
    }


}
