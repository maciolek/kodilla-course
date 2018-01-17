package com.kodilla.good.patterns.challenges;

public class Application {

    public static void main(String[] args) {

        OrderRetriever orderRetriever = new OrderRetriever();
        Order order = orderRetriever.retrieve();

        Processor processor = new Processor(new EmailInformationService(),
                new GameSaleService(), new DatebaseSaleRepository());
        processor.process(order);
    }
}
