package com.kodilla.good.patterns.challenges.foodproducers;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Application {

    public static void main(String[] args) {

        ExtraFoodShopProducer producerExtraFoodShopProducer = new ExtraFoodShopProducer("ExtraFoodShopProducer",
                "Zakopane ul. Polna 3");
        HealthyShopProducer producerHealthyShop = new HealthyShopProducer("HealthyShop",
                "Nowy Sącz ul. Rolna 43");

        Product product = new Product("Mleko", BigDecimal.valueOf(2.49), 50, producerExtraFoodShopProducer.getName());
        Product product1 = new Product("Ser owczy", BigDecimal.valueOf(1.49), 85, producerExtraFoodShopProducer.getName());
        Product product2 = new Product("Ser pleśniowy", BigDecimal.valueOf(2.49), 35, producerHealthyShop.getName());
        Product product3 = new Product("Ser owczy", BigDecimal.valueOf(3.99), 150, producerHealthyShop.getName());

        StoreService storeService = new StoreService();

        storeService.addProduct(product);
        storeService.addProduct(product1);
        storeService.addProduct(product2);
        storeService.addProduct(product3);

        User user = new User("Piotr", "Buła",
                "pietrucha", "Katowice ul. Szkolna 8", "pietruch12@wp.pl");
        Order order = new Order(user, LocalDate.of(2017, 10, 15),product, 2);

        Processor processor = new Processor(new MailInformation(), producerExtraFoodShopProducer, storeService);
        processor.process(order);
    }
}
