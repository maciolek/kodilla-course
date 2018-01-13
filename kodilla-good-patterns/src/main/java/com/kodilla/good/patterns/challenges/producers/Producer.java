package com.kodilla.good.patterns.challenges.producers;

import java.util.Objects;

public class Producer implements ProducerProcess {

    private String nameOfProducer;
    private String residenceAddress;

    public Producer(String nameOfProducer, String residenceAddress) {
        this.nameOfProducer = nameOfProducer;
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

    public String getNameOfProducer() {
        return nameOfProducer;
    }

    public String getResidenceAddress() {
        return residenceAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producer producer = (Producer) o;
        return Objects.equals(nameOfProducer, producer.nameOfProducer) &&
                Objects.equals(residenceAddress, producer.residenceAddress);
    }

    @Override
    public int hashCode() {

        return Objects.hash(nameOfProducer, residenceAddress);
    }

    @Override
    public String toString() {
        return "Nazwa producenta " + nameOfProducer +
                " siedziba " + residenceAddress + "\n";


    }
}


