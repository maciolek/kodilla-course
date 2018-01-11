package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class SaleRequestRetriever {

    public SaleRequest retrieve() {

        User user = new User("Jolanta", "Kowalska", "JolKow", "jolakow@gmail.com");
        Product product = new Product("Watch Dog 2", 149.99);
        SaleRequest saleRequest = new SaleRequest(user, LocalDate.of(2018, 01, 05), product);

        return saleRequest;
    }
}
