package com.kodilla.testing.shape;

import com.kodilla.testing.com.kodilla.testing.shape.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ShapeCollectorTestSuite {
    private static int counter = 1;

    @Before
    public void Before() {
        System.out.println("Start testu nr " + counter);
    }

    @After
    public void After() {
        System.out.println("Koniec testu nr " + counter);
        counter++;
    }

    @Test
    public void testAddFigure() {
    //given
        ShapeCollector objShapeCollector = new ShapeCollector();
    //when
        objShapeCollector.addFigure(new Circle(2.0));
    //then
        Assert.assertEquals(1, objShapeCollector.shapesList.size());
    }

    @Test
    public void testRemoveFigure() {
    //given
        ShapeCollector objShapeCollector = new ShapeCollector();
        Shape circle = new Circle(2.0);
        objShapeCollector.addFigure(circle);
    //when
        boolean result = objShapeCollector.removeFigure(circle);
    //then
        Assert.assertTrue(result);
        Assert.assertEquals(0, objShapeCollector.shapesList.size());
    }

    @Test
    public void testGetFigure() {
    //given
        ShapeCollector objShapeCollector = new ShapeCollector();
        Shape circle = new Circle(2.0);
        objShapeCollector.addFigure(circle);
    //when
        Shape expectedFigure = objShapeCollector.getFigure(0);
    //then
        Assert.assertEquals(expectedFigure, circle);
    }

    @Test
    public void testShowFigures() {
    //given
        ShapeCollector objShapeCollector = new ShapeCollector();
        Shape circle = new Circle(2.0);
        objShapeCollector.addFigure(circle);
        objShapeCollector.showFigures();
    //when

    //then
        Assert.assertEquals(1, objShapeCollector.shapesList.size());
    }
}

