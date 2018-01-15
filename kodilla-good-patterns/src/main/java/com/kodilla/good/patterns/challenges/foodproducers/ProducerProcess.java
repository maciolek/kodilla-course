package com.kodilla.good.patterns.challenges.foodproducers;

public interface ProducerProcess {

    boolean process(User user, Product product, StoreService storeService);
}
