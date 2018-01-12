package com.kodilla.good.patterns.challenges.producers;

public class ProductOrderService {

    private SaleInformation saleInformation;
    private ProducerProcess producerProcess;

    public ProductOrderService(SaleInformation saleInformation, ProducerProcess producerProcess) {

        this.saleInformation = saleInformation;
        this.producerProcess = producerProcess;
    }

    public boolean process(SaleRequest saleRequest) {
        boolean isSold = producerProcess.process(saleRequest.getUser(), saleRequest.getProduct());
        if (isSold) {
            saleInformation.inform(saleRequest.getUser(), saleRequest.getProduct(), saleRequest.getDateOfSale());

        }
        System.out.println("Zamówienie nie może zostać zrealizowane");
        return isSold;
    }
}
