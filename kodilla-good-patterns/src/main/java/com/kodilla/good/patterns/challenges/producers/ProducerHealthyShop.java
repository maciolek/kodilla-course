package com.kodilla.good.patterns.challenges.producers;

import java.time.LocalDate;

public class ProducerHealthyShop extends Producer {


    public ProducerHealthyShop(String nameOfProducer, String residenceAdress, AvailableProducts availableProducts) {
        super(nameOfProducer, residenceAdress, availableProducts);
    }

    @Override
    public boolean process(User user, Product product) {

        return super.process(user, product);
    }

    @Override
    public String getNameOfProducer() {
        return super.getNameOfProducer();
    }

    @Override
    public String getResidenceAdress() {
        return super.getResidenceAdress();
    }

    @Override
    public AvailableProducts getAvailableProducts() {
        return super.getAvailableProducts();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
