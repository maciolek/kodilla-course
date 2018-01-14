package com.kodilla.good.patterns.challenges.foodproducers;

public interface SaleProcess {

    boolean process(User user, Product product, AvailableProducts availableProducts);
}
