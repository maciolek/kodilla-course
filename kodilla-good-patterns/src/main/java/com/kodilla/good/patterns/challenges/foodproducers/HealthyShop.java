package com.kodilla.good.patterns.challenges.foodproducers;

public class HealthyShop implements ProducerProcess {

    private String name;
    private String residenceAddress;

    public HealthyShop(String name, String residenceAddress) {
        this.name = name;
        this.residenceAddress = residenceAddress;
    }
    @Override
    public void process(Product product, int volumeOfPurchase) {
        System.out.print("\nTowar: " + product.getName() + " jest przygotowywany do wysyłki");
        System.out.println("\nZAPRASZAMY!");
    }

    public String getName() {
        return name;
    }

    public String getResidenceAddress() {
        return residenceAddress;
    }

    @Override
    public String toString() {
        return "\nNazwa producenta " + name +
                " siedziba " + residenceAddress;
    }
}


