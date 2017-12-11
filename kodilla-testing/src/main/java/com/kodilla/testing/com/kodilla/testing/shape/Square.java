package com.kodilla.testing.com.kodilla.testing.shape;

public class Square implements Shape {

    private Double side;

    public Square(Double side) {
        this.side = side;
    }

    public String getShapeName() {
        return "This is Square";
    }

    public Double getField() {
        Double fieldSquare = side*side;
        return fieldSquare;
    }
}
