package com.kodilla.testing.com.kodilla.testing.shape;

public class Circle implements Shape{

    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    public String  getShapeName() {
     return "This is Circle";
    }

    public Double getField(){
        Double fieldCircle =Math.PI*radius*radius;
        return fieldCircle;
    }

}
