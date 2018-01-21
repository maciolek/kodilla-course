package com.kodilla.good.patterns.challenges.foodproducers;

public class Processor {

    private SaleInformation saleInformation;
    private RegisterProducers registerProducers;

    public Processor(SaleInformation saleInformation, RegisterProducers registerProducers) {
        this.saleInformation = saleInformation;
        this.registerProducers = registerProducers;
    }

    public ProducerProcess getProducerOfProduct(Product product) {
        return registerProducers.getProducerOfSpecyficProduct(product);
    }

    public void process(Order order) {

        registerProducers.showAllAvailableProducts();
        boolean isAvailable = registerProducers.isAvailableProduct(order.getProduct(), order.getVolumeOfPurchase());
        getProducerOfProduct(order.getProduct()).process(order.getProduct(), order.getVolumeOfPurchase());
        saleInformation.inform(order, isAvailable);
        if (!isAvailable) {
            System.out.println("Zamówienie nie może zostać zrealizowane.");
        }
    }
}




