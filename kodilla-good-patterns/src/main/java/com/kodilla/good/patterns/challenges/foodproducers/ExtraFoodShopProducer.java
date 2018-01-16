package com.kodilla.good.patterns.challenges.foodproducers;

import java.util.Objects;

public class ExtraFoodShopProducer implements ProducerProcess {

    private String name;
    private String residenceAddress;

    public ExtraFoodShopProducer(String name, String residenceAddress) {
        this.name = name;
        this.residenceAddress = residenceAddress;
    }

    @Override
    public void process(Product product, int volumeOfPurchase) {
        System.out.print("\nTowar: " + product.getName() + " jest przygotowywany do wysyłki");
        System.out.print("\nIlość dostepnych sztuk: " + product.getQuantity());
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