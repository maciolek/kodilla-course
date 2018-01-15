package com.kodilla.good.patterns.challenges.foodproducers;

public class Processor {

    private SaleInformation saleInformation;
    private ProducerProcess producerProcess;
    private StoreService storeService;

    public Processor(SaleInformation saleInformation, ProducerProcess producerProcess, StoreService storeService) {

        this.saleInformation = saleInformation;
        this.producerProcess = producerProcess;
        this.storeService = storeService;
    }

    public boolean process(Order order) {

        storeService.showAllAvailableProduct();
        boolean isSold = producerProcess.process(order.getUser(), order.getProduct(), storeService);
        saleInformation.inform(order, isSold);

        if (isSold) {
            storeService.SetQuantityAfterSale(order.getProduct(),order.getVolumeOfPurchase());
        } else {
            System.out.println("Zamówienie nie może zostać zrealizowane.");
        }
        return false;
    }
}

