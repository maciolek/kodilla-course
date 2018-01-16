package com.kodilla.good.patterns.challenges.foodproducers;

import java.time.LocalDate;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        Producer producerExtraFoodShopProducer = new ExtraFoodShopProducer("ExtraFoodShopProducer",
                "Zakopane ul. Polna 3");
        Producer producerHealthyShop = new Producer("HealthyShop",
                "Nowy Sącz ul. Rolna 43");
        ProducerProcess producerGlutenFreeShop = new GlutenFreeShop("GlutenFreeShop",
                "Rabka Zdrój ul. Łąkowa 4");

        Product product = new Product("Mleko", 2.49, 50);
        Product product1 = new Product("Ser owczy", 1.49, 85);
        Product product2 = new Product("Ser pleśniowy", 2.49, 35);
        Product product3 = new Product("Masło", 6.99, 80);
        Product product4 = new Product("Mleko bez laktozy", 4.99, 250);
        Product product5 = new Product("Kefir", 1.99, 50);
        Product product6 = new Product("Maślanka", 2.50, 750);
        Product product7 = new Product("Oscypek", 4.99, 150);

        Order order = new Order(new User("Piotr", "Buła",
                "pietrucha", "Katowice ul. Szkolna 8", "pietruch12@wp.pl")
                , LocalDate.of(2017, 10, 15),product, 2);

        AvailableProducts productsOfExtraFoodShopProducer = new AvailableProducts();
        AvailableProducts productsOfHealthyShopProducer = new AvailableProducts();
        AvailableProducts productsOfGlutenFreeShopProducer = new AvailableProducts();

        productsOfExtraFoodShopProducer.addNewProduct(product);
        productsOfExtraFoodShopProducer.addNewProduct(product1);
        productsOfExtraFoodShopProducer.addNewProduct(product2);
        productsOfExtraFoodShopProducer.addNewProduct(product4);
        productsOfExtraFoodShopProducer.addNewProduct(product5);

        productsOfHealthyShopProducer.addNewProduct(product1);
        productsOfHealthyShopProducer.addNewProduct(product2);
        productsOfHealthyShopProducer.addNewProduct(product4);

        productsOfGlutenFreeShopProducer.addNewProduct(product5);
        productsOfGlutenFreeShopProducer.addNewProduct(product3);
        productsOfGlutenFreeShopProducer.addNewProduct(product6);
        productsOfGlutenFreeShopProducer.addNewProduct(product7);

        System.out.println(productsOfExtraFoodShopProducer.getListOfProducts().size());
        System.out.println(productsOfHealthyShopProducer.getListOfProducts().size());
        System.out.println(productsOfGlutenFreeShopProducer.getListOfProducts().size());

        RegisterProducers registerProducers = new RegisterProducers();
        registerProducers.addNewProducer(producerExtraFoodShopProducer,productsOfExtraFoodShopProducer);
        registerProducers.addNewProducer(producerHealthyShop,productsOfGlutenFreeShopProducer);
        registerProducers.addNewProducer(producerGlutenFreeShop,productsOfGlutenFreeShopProducer);

        System.out.println(registerProducers.getRegisterProducers().size());
registerProducers.showAllAvailableProducts();

        Processor processor = new Processor(new MailInformation(), producerHealthyShop ,registerProducers);
        processor.process(order);
    }
}
