package com.kodilla.good.patterns.challenges.foodproducers;

public class GlutenFreeShop extends Producer implements ProducerProcess {

    public GlutenFreeShop(String name, String residenceAddress) {
        super(name, residenceAddress);
    }


    public void process(Product product, int volumeOfPurchase) {
        super.process(product, volumeOfPurchase);
        System.out.println("Towar: " + product.getName() + " jest przygotowywany do wysyłki");
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
