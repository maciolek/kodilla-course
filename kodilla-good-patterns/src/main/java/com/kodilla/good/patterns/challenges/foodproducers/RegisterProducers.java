package com.kodilla.good.patterns.challenges.foodproducers;

import java.util.HashMap;
import java.util.Map;

public class RegisterProducers {

    Map<ProducerProcess, AvailableProducts> registerProducers = new HashMap<ProducerProcess, AvailableProducts>();

    public void addNewProducer(ProducerProcess producer, AvailableProducts availableProducts) {
        registerProducers.put(producer, availableProducts);
    }

    public Map<ProducerProcess, AvailableProducts> getRegisterProducers() {
        return registerProducers;
    }

    public void showAllAvailableProducts() {
        for (Map.Entry<ProducerProcess, AvailableProducts> current : registerProducers.entrySet()) {
            System.out.println(current.getKey());
            for (Product currentProduct: current.getValue().getListOfProducts()){
                if(currentProduct.getQuantity()>0)
                System.out.println(currentProduct.toString());
            }
        }
    }
}

