package com.kodilla.testing.shape;

import com.kodilla.testing.com.kodilla.testing.shape.Circle;
import com.kodilla.testing.com.kodilla.testing.shape.ShapeCollector;
import com.kodilla.testing.com.kodilla.testing.shape.Square;
import com.kodilla.testing.com.kodilla.testing.shape.Triangle;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ShapeCollectorTestSuite {
private static int counter=1;

    @Before
    public void Before (){
        System.out.println("Start testu nr " + counter );
    }
    @After
    public void After(){
        System.out.println("Start testu nr " + counter );
        counter++;
    }
    @Test

    public void testAddFigure(){
//given
        ShapeCollector objShapeCollector = new ShapeCollector();
//when
        objShapeCollector.addFigure(new Circle(2.0));
//then
        Assert.assertEquals(1,objShapeCollector.shapesList.size());
    }

    @Test

    public void removeFigure(){
//given
        ShapeCollector objShapeCollector = new ShapeCollector();
    }
}
