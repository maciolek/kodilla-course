package com.kodilla.good.patterns.challenges;

import java.math.BigDecimal;
import java.time.LocalDate;

public class OrderRetriever {

    public Order retrieve() {

        User user = new User("Jolanta", "Kowalska", "JolKow", "jolakow@gmail.com");
        Product product = new Product("Watch Dog 2", BigDecimal.valueOf(149.99));
        Order order = new Order(user, LocalDate.of(2018, 01, 05), product);

        return order;
    }
}
