package com.kodilla.good.patterns.challenges.foodproducers;

import java.util.Objects;

public class HealthyShopProducer implements SaleProcess {

    private String name;
    private String residenceAddress;

    public HealthyShopProducer(String name, String residenceAddress) {
        this.name = name;
        this.residenceAddress = residenceAddress;
    }

    @Override
    public boolean process(User user, Product product, AvailableProducts availableProducts) {
        if (availableProducts.isAvailableProduct(product)) {
            System.out.println("Zamówienie w trakcie przetwarzania\n");
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public String getResidenceAddress() {
        return residenceAddress;
    }

    @Override
    public String toString() {
        return "Nazwa producenta " + name +
                " siedziba " + residenceAddress + "\n";
    }
}


