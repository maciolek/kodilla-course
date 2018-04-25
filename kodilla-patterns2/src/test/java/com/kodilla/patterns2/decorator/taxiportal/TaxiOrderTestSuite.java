package com.kodilla.patterns2.decorator.taxiportal;

import com.kodilla.patterns2.decorator.taxiportal.taxiportal.*;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class TaxiOrderTestSuite {

    @Test
    public void testBasicTaxiOrderGetCost() {
        //given
        TaxiOrder theOrder = new BasicTaxiOrder();
        //when
        BigDecimal calculatedCost = theOrder.getCost();
        //then
        Assert.assertEquals(new BigDecimal(5.00), calculatedCost);
    }

    @Test
    public void testBasicTaxiOrderGetDescription() {
//given
        TaxiOrder theOrder = new BasicTaxiOrder();
        //when
        String description = theOrder.getDescription();
        //then
        Assert.assertEquals("Drive a course", description);
    }

    @Test
    public void testTaxiNetworkGetCost() {
        //given
        TaxiOrder theOrder = new BasicTaxiOrder();
        TaxiNetworkOrderDecorator taxiNetworkOrder = new TaxiNetworkOrderDecorator(theOrder);
        //when
        BigDecimal calculatedCost = taxiNetworkOrder.getCost();
        //then
        Assert.assertEquals(new BigDecimal(40.00), calculatedCost);
    }

    @Test
    public void testTaxiNetworkGetDescription() {
        //given
        TaxiOrder theOrder = new BasicTaxiOrder();
        TaxiNetworkOrderDecorator taxiNetworkOrder = new TaxiNetworkOrderDecorator(theOrder);
        //when
        String description = taxiNetworkOrder.getDescription();
        //then
        Assert.assertEquals("Drive a course by Taxi Network", description);
    }

    @Test
    public void testMyTaxiWithChildSeatGetCost() {
        //given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new MyTaxiNetworkOrderDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);

        //when
        BigDecimal calculatedCost = theOrder.getCost();

        //then
        Assert.assertEquals(new BigDecimal(27.00), calculatedCost);
    }

    @Test
    public void testMyTaxiWithChildSeatGetDescription() {
        //given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new MyTaxiNetworkOrderDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);

        //when
        String description = theOrder.getDescription();

        //then
        Assert.assertEquals("Drive a course by MyTaxi Network + child seat", description);
    }

    @Test
    public void testMyTaxiWithTwoChildSeatGetCost() {
        //given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new MyTaxiNetworkOrderDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);

        //when
        BigDecimal calculatedCost = theOrder.getCost();

        //then
        Assert.assertEquals(new BigDecimal(29.00), calculatedCost);
    }

    @Test
    public void testMyTaxiWithTwoChildSeatGetDescription() {
        //given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new MyTaxiNetworkOrderDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);

        //when
        String description = theOrder.getDescription();

        //then
        Assert.assertEquals("Drive a course by MyTaxi Network + child seat + child seat", description);
    }

    @Test
    public void testVipTaxiNetworkWithChildSeatExpressGetCost() {

        //given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        theOrder = new VipDecorator(theOrder);
        theOrder = new ExpressDecorator(theOrder);

        //when
        BigDecimal calculatedCost = theOrder.getCost();

        //then
        Assert.assertEquals(new BigDecimal(57.00), calculatedCost);
    }

    @Test
    public void testVipTaxiNetworkWithChildSeatExpressGetDescription() {

        //given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        theOrder = new VipDecorator(theOrder);
        theOrder = new ExpressDecorator(theOrder);

        //when
        String description = theOrder.getDescription();

        //then
        Assert.assertEquals("Drive a course by Taxi Network + child seat + variant VIP + express service", description);
    }
}
