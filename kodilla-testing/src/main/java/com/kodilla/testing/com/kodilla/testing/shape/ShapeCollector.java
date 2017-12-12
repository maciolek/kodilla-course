package com.kodilla.testing.com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ShapeCollector {

    public ArrayList<Shape> shapesList = new ArrayList<Shape>();

    public void addFigure(Shape shape) {
        shapesList.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (shapesList.contains(shape)) {
            shapesList.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n) {
        Shape theFigure = null;
        if ((n >= 0) && (n <= shapesList.size())) {
            theFigure = shapesList.get(n);
        }
        return theFigure;
    }

    public ArrayList<String> showFigures() {
        ArrayList<String> showList = new ArrayList<String>();
        for (Shape currentShape : shapesList) {
            String currentShowFigure = (currentShape.getShapeName() + " " + currentShape.getField());
            showList.add(currentShowFigure);
        }
        return showList;
    }
}
