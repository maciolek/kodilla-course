package com.kodilla.good.patterns.challenges.producers;

import java.util.Map;

public class ProductOrderService {

    private SaleInformation saleInformation;
    private ProducerProcess producerProcess;
    private AvailableProducts availableProducts;

    public ProductOrderService(SaleInformation saleInformation, ProducerProcess producerProcess, AvailableProducts availableProducts) {

        this.saleInformation = saleInformation;
        this.producerProcess = producerProcess;
        this.availableProducts = availableProducts;
    }

    public boolean process(SaleRequest saleRequest) {
        boolean isSold = producerProcess.process(saleRequest.getUser(), saleRequest.getProduct(), availableProducts);
        System.out.println("isAvailable " + isSold);
        if (isSold) {
            availableProducts.showAllAvailableProduct(saleRequest.getProduct());
            saleInformation.inform(saleRequest.getUser(), saleRequest.getProduct(), saleRequest.getDateOfSale());
            return true;
        } else {
            System.out.println("Zamówienie nie może zostać zrealizowane");
        }
        return false;
    }
}

