package com.kodilla.good.patterns.challenges.foodproducers;

import java.math.BigDecimal;
import java.time.LocalDate;

public class OrderRetriever {

    public Order retrieve () {
        User user = new User("Piotr", "Buła",
                "pietrucha", "Katowice ul. Szkolna 8", "pietruch12@wp.pl");

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
        //       ExtraFoodShopProducer producer = new ExtraFoodShopProducer("GlutenFreeShop", "Kraków ul. Rynek 8");

        Order order = new Order(user, LocalDate.of(2017, 10, 15), product3, 2);

        return order;
    }
}
