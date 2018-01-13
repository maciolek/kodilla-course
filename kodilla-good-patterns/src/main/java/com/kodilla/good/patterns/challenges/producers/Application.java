package com.kodilla.good.patterns.challenges.producers;

import java.time.LocalDate;

public class Application {

    public static void main(String[] args) {

        User user = new User("Piotr", "Buła",
                "pietrucha", "Katowice ul. Szkolna 8", "pietruch12@wp.pl");

        Product product = new Product("Mleko", 2.49, 50);
        Product product1 = new Product("Ser owczy", 1.49, 85);
        Product product2 = new Product("Ser pleśniowy", 2.49, 35);
        Product product3 = new Product("Ser owczy", 3.99,150);

        AvailableProducts availableProducts = new AvailableProducts();

        Producer producerExtraFoodShop = new Producer("ExtraFoodShop",
                "Zakopane ul. Polna 3");
        Producer producerHealthyShop = new Producer("HealthyShop",
                "Nowy Sącz ul. Rolna 43");
        Producer producer = new Producer("GlutenFreeShop", "Kraków ul. Rynek 8");

        boolean a = availableProducts.addProduct(producer,product2);
        System.out.println("0" + a);
        a = availableProducts.addProduct(producerHealthyShop,product2);
        System.out.println("1" + a);
        a =  availableProducts.addProduct(producer,product2);
        System.out.println("2" + a);
        a = availableProducts.addProduct(producer,product2);
        System.out.println("3" + a);
        a= availableProducts.addProduct(producerExtraFoodShop,product2);
        System.out.println("4" + a);

        SaleRequest saleRequest = new SaleRequest(user, LocalDate.of(2017, 10, 15),product2);

        ProductOrderService productOrderService = new ProductOrderService(new MailInformation(),producer,availableProducts);
        boolean isSold = productOrderService.process(saleRequest);
//        System.out.println(availableProducts.getListOfProduct().size());
//        System.out.println(producerExtraFoodShop.getNameOfProducer());
//        System.out.println(producerExtraFoodShop.getResidenceAdress());

        }
}
