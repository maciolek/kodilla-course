package com.kodilla.good.patterns.challenges.foodproducers;

public class Processor {

    private SaleInformation saleInformation;
    private ProducerProcess producerProcess;
    private RegisterProducers registerProducers;

    public Processor(SaleInformation saleInformation, ProducerProcess producerProcess, RegisterProducers registerProducers) {

        this.saleInformation = saleInformation;
        this.producerProcess = producerProcess;
        this.registerProducers= registerProducers;
    }

    public boolean process(Order order) {
 //       registerProducers.showAllAvailableProduct();
        boolean isSold = producerProcess.process(order.getProduct(),order.getVolumeOfPurchase());
        saleInformation.inform(order, isSold);

        if (isSold) {
    //        storeHouse.SetQuantityAfterSale(order.getProduct(),order.getVolumeOfPurchase());
        } else {
            System.out.println("Zamówienie nie może zostać zrealizowane.");
        }
        System.out.println(order.getProduct().getQuantity());
        System.out.println(registerProducers.getRegisterProducers().get(order.getProduct()).getListOfProducts().indexOf(order.getProduct()));
        return false;
    }

    }




