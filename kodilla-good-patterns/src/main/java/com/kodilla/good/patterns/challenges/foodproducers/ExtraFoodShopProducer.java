package com.kodilla.good.patterns.challenges.foodproducers;

public class ExtraFoodShopProducer extends Producer implements ProducerProcess {

    public ExtraFoodShopProducer(String name, String residenceAddress) {
        super(name, residenceAddress);
    }

    @Override
    public void process(Product product, int volumeOfPurchase) {
        System.out.print("\nTowar: " + product.getName() + " jest przygotowywany do wysyłki");
        System.out.print("Ilość dostepnych sztuk: " + product.getQuantity());
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


