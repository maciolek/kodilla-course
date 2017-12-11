package com.kodilla.testing.com.kodilla.testing.shape;

public class Square implements Shape {

    private Double side;

    public Square(Double side) {
        this.side = side;
    }

    public String getShapeName() {
        return "Square";
    }

    public Double getField() {
        return Math.pow(side,2.0);
    }
}
