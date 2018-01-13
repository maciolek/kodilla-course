package com.kodilla.good.patterns.challenges.producers;

import java.time.LocalDate;

public class ProducerHealthyShop extends Producer {


    public ProducerHealthyShop(String nameOfProducer, String residenceAdress) {
        super(nameOfProducer, residenceAdress);
    }

    @Override
    public boolean process(User user, Product product, AvailableProducts availableProducts) {
        return super.process(user, product, availableProducts);
    }

    @Override
    public String getNameOfProducer() {
        return super.getNameOfProducer();
    }

    @Override
    public String getResidenceAddress() {
        return super.getResidenceAddress();
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
    public String toString() {
        return super.toString();
    }
}
