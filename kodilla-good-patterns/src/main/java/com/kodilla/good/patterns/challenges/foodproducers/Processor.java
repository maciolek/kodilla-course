package com.kodilla.good.patterns.challenges.foodproducers;

public class Processor {

    private SaleInformation saleInformation;
    private ProducerProcess producerProcess;
    private RegisterProducers registerProducers;

    public Processor(SaleInformation saleInformation, ProducerProcess producerProcess, RegisterProducers registerProducers) {

        this.saleInformation = saleInformation;
        this.producerProcess = producerProcess;
        this.registerProducers = registerProducers;
    }

    public boolean process(Order order) {

        registerProducers.showAllAvailableProducts();

        boolean isAvailable = registerProducers.isAvailableProduct(order.getProduct(),order.getVolumeOfPurchase());
        producerProcess.process(order.getProduct(), order.getVolumeOfPurchase());
        saleInformation.inform(order, isAvailable);

        if (isAvailable) {
            order.getProduct().setQuantity(order.getProduct().getQuantity() - order.getVolumeOfPurchase());
        } else {
            System.out.println("Zamówienie nie może zostać zrealizowane.");
        }

        return false;
    }

}




