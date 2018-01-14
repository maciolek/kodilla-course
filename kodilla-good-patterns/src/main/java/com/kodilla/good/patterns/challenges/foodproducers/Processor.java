package com.kodilla.good.patterns.challenges.foodproducers;

public class Processor {

    private SaleInformation saleInformation;
    private SaleProcess saleProcess;
    private AvailableProducts availableProducts;

    public Processor(SaleInformation saleInformation, SaleProcess saleProcess, AvailableProducts availableProducts) {

        this.saleInformation = saleInformation;
        this.saleProcess = saleProcess;
        this.availableProducts = availableProducts;
    }

    public boolean process(Order order) {
        boolean isSold = saleProcess.process(order.getUser(), order.getProduct(),availableProducts);
        System.out.println("isAvailable " + isSold);
        saleInformation.inform(order, isSold);
        if (isSold) {
//          availableProducts.showAllAvailableProduct(order.getProduct());
            availableProducts.SetQuantityAfterSale(order.getProduct(),order.getVolumeOfPurchase());
        } else {
            System.out.println("Zamówienie nie może zostać zrealizowane");
        }
        return false;
    }
}

