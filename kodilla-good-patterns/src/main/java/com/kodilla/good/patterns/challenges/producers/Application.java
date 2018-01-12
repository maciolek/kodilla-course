package com.kodilla.good.patterns.challenges.producers;

import java.time.LocalDate;

public class Application {

    public static void main(String[] args) {


        User user = new User("Piotr", "Buła",
                "pietrucha", "Katowice ul. Szkolna 8", "pietruch12@wp.pl");

        Product product = new Product("Mleko", 2.49, 50);
        Product product1 = new Product("Ser owczy", 1.49, 85);
        Product product2 = new Product("Ser pleśniowy", 2.49, 35);

        AvailableProducts availableProductsOfProducer1 = new AvailableProducts();
        AvailableProducts availableProductsOfProducer2 = new AvailableProducts();

        availableProductsOfProducer1.addProduct(product);
        availableProductsOfProducer1.addProduct(product1);

        availableProductsOfProducer2.addProduct(product2);

        Producer producerExtraFoodShop = new Producer("ExtraFoodShop",
                "Zakopane ul. Polna 3", availableProductsOfProducer1);
        Producer producerHealthyShop = new ProducerHealthyShop("HealthyShop",
                "Nowy Sącz ul. Rolna 43", availableProductsOfProducer2);

        SaleRequest saleRequest = new SaleRequest(user, LocalDate.of(2017, 10, 15), product2);

        ProductOrderService productOrderService = new ProductOrderService(new MailInformation(),producerExtraFoodShop);
        boolean isSold = productOrderService.process(saleRequest);
//        System.out.println(availableProductsOfProducer1.getListOfProduct().size());
//        System.out.println(isSold);

        System.out.println(producerExtraFoodShop.getNameOfProducer());
        System.out.println(producerExtraFoodShop.getAvailableProducts());
        System.out.println(producerExtraFoodShop.getResidenceAdress());
    }
}
