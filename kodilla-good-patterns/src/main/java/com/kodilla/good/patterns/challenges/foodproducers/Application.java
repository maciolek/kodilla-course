package com.kodilla.good.patterns.challenges.foodproducers;

import java.math.BigDecimal;

public class Application {

    public static void main(String[] args) {

        Product product = new Product("Mleko", BigDecimal.valueOf(2.49), 50, "ExtraFoodShopProducer");
        Product product1 = new Product("Ser owczy", BigDecimal.valueOf(1.49), 85, "ExtraFoodShopProducer");
        Product product2 = new Product("Ser pleśniowy", BigDecimal.valueOf(2.49), 35, "HealthyShop");
        Product product3 = new Product("Ser owczy", BigDecimal.valueOf(3.99), 150, "GlutenFreeShop");
        AvailableProducts availableProducts = new AvailableProducts();
        availableProducts.addProduct(product);
        availableProducts.addProduct(product1);
        availableProducts.addProduct(product2);
        availableProducts.addProduct(product3);

        ExtraFoodShopProducer producerExtraFoodShopProducer = new ExtraFoodShopProducer("ExtraFoodShopProducer",
                "Zakopane ul. Polna 3");
        HealthyShopProducer producerHealthyShop = new HealthyShopProducer("HealthyShop",
                "Nowy Sącz ul. Rolna 43");
        OrderRetriever orderRetriever = new OrderRetriever();
        Order order =orderRetriever.retrieve();
        Processor processor = new Processor(new MailInformation(), producerExtraFoodShopProducer, availableProducts);
        processor.process(order);

    }
}
