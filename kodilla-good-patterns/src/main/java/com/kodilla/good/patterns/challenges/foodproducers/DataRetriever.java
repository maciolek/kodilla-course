package com.kodilla.good.patterns.challenges.foodproducers;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.time.LocalDate;

public class DataRetriever {

    public void retrieve() {

        ProducerProcess producerExtraFoodShopProducer = new ExtraFoodShopProducer("ExtraFoodShopProducer",
                "Zakopane ul. Polna 3");
        ProducerProcess producerHealthyShop = new HealthyShop("HealthyShop",
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
        Product product8 = new Product("Masło osełkowe", 14.99, 50);
        Product product9 = new Product("Kefir wiejski", 3.99, 100);
        Product product10 = new Product("Kiełbasa lisiecka", 64.99, 40);

        RegistrerProducts productsOfExtraFoodShopProducer = new RegistrerProducts();
        RegistrerProducts productsOfHealthyShopProducer = new RegistrerProducts();
        RegistrerProducts productsOfGlutenFreeShopProducer = new RegistrerProducts();

        productsOfExtraFoodShopProducer.addNewProduct(product);
        productsOfExtraFoodShopProducer.addNewProduct(product1);
        productsOfExtraFoodShopProducer.addNewProduct(product2);
        productsOfExtraFoodShopProducer.addNewProduct(product3);
        productsOfExtraFoodShopProducer.addNewProduct(product4);

        productsOfHealthyShopProducer.addNewProduct(product5);
        productsOfHealthyShopProducer.addNewProduct(product6);
        productsOfHealthyShopProducer.addNewProduct(product7);

        productsOfGlutenFreeShopProducer.addNewProduct(product8);
        productsOfGlutenFreeShopProducer.addNewProduct(product9);
        productsOfGlutenFreeShopProducer.addNewProduct(product10);

        RegisterProducers registerProducers = new RegisterProducers();

        registerProducers.addNewProducer(producerExtraFoodShopProducer, productsOfExtraFoodShopProducer);
        registerProducers.addNewProducer(producerHealthyShop, productsOfHealthyShopProducer);
        registerProducers.addNewProducer(producerGlutenFreeShop, productsOfGlutenFreeShopProducer);

        Order order = new Order(new User("Piotr", "Buła",
                "pietrucha", "Katowice ul. Szkolna 8", "pietruch12@wp.pl")
                , LocalDate.of(2017, 10, 15), product8, 2);

        Processor processor = new Processor(new MailInformation(), registerProducers);
        processor.process(order);

    }

}
