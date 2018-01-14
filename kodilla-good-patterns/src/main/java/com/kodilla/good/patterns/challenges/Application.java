package com.kodilla.good.patterns.challenges;

public class Application {

    public static void main(String[] args) {

        SaleRequestRetriever saleRequestRetriever = new SaleRequestRetriever();
        Order order = saleRequestRetriever.retrieve();

        Processor processor = new Processor(new EmailInformationService(),
                new GameSaleService(), new DatebaseSaleRepository());
        processor.process(order);
    }
}
