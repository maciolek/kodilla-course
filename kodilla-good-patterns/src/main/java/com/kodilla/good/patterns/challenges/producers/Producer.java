package com.kodilla.good.patterns.challenges.producers;

public class Producer implements ProducerProcess {

    private String nameOfProducer;
    private String residenceAdress;
    private AvailableProducts availableProducts;

    public Producer(String nameOfProducer, String residenceAdress, AvailableProducts availableProducts) {
        this.nameOfProducer = nameOfProducer;
        this.residenceAdress = residenceAdress;
        this.availableProducts = availableProducts;
    }

    @Override
    public boolean process(User user, Product product) {
        if (availableProducts.getListOfProduct().contains(product) && availableProducts.isAvailableProduct(product)) {
            System.out.println("Zamówienie przyjęte do realizacji.");
            return true;
        }
        return false;
    }

    public String getNameOfProducer() {
        return nameOfProducer;
    }

    public String getResidenceAdress() {
        return residenceAdress;
    }

    public AvailableProducts getAvailableProducts() {
        return availableProducts;
    }
}


