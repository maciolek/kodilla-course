package com.kodilla.testing.com.kodilla.testing.shape;

public class Circle implements Shape {

    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }
    public String getShapeName() {
        return "Circle";
    }
    public Double getField() {
        return Math.PI * Math.pow(radius,2.0);
    }
}

