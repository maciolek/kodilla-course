package com.kodilla.good.patterns.challenges.foodproducers;

public class GlutenFreeShop extends Producer implements ProducerProcess {

    public GlutenFreeShop(String name, String residenceAddress) {
        super(name, residenceAddress);
    }

    @Override
    public boolean process(Product product, int volumeOfPurchase) {
        return super.process(product, volumeOfPurchase);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getResidenceAddress() {
        return super.getResidenceAddress();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
