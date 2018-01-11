package com.kodilla.good.patterns.challenges;

public class Application {

    public static void main(String[] args) {

        SaleRequestRetriever saleRequestRetriever = new SaleRequestRetriever();
        SaleRequest saleRequest = saleRequestRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(new EmailInformationService(),
                new GameSaleService(), new GameSaleRepository());
        productOrderService.process(saleRequest);
    }
}
