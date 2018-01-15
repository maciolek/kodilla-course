package com.kodilla.good.patterns.challenges.foodproducers;

public class ExtraFoodShopProducer implements ProducerProcess {

    private String name;
    private String residenceAddress;

    public ExtraFoodShopProducer(String name, String residenceAddress) {
        this.name = name;
        this.residenceAddress = residenceAddress;
    }

    @Override
    public boolean process(User user, Product product, StoreService storeService) {
        if (storeService.isAvailableProduct(product)) {
            System.out.println("Zamówienie w trakcie przetwarzania\n");
            System.out.println("Zachęcamy do skorzystania z naszych promocji!");
            return true;
        } else {
            System.out.println("Zamówienie nie może zostać z realizowane");

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


