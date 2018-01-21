package com.kodilla.good.patterns.challenges.foodproducers;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class RegisterProducers {

    Map<ProducerProcess, RegistrerProducts> registerProducers = new HashMap<ProducerProcess, RegistrerProducts>();

    public void addNewProducer(ProducerProcess producer, RegistrerProducts registrerProducts) {
        registerProducers.put(producer, registrerProducts);
    }

    public void showAllAvailableProducts() {
        for (Map.Entry<ProducerProcess, RegistrerProducts> current : registerProducers.entrySet()) {
            System.out.println(current.getKey());
            for (Product currentProduct : current.getValue().getListOfProducts()) {
                if (currentProduct.getQuantity() > 0)
                    System.out.println(currentProduct.toString());
            }
        }
    }

    public boolean isAvailableProduct(Product product, int volumeOfPurchase) {
        for (Map.Entry<ProducerProcess, RegistrerProducts> current : registerProducers.entrySet()) {
            for (Product currentProduct : current.getValue().getListOfProducts()) {
                if (currentProduct.equals(product) && currentProduct.getQuantity() > volumeOfPurchase) {
                    product.setQuantityAfterSale(volumeOfPurchase);
                    return true;
                }
            }
        }
        return false;
    }

    public ProducerProcess getProducerOfSpecyficProduct(Product product) {
        for (Map.Entry<ProducerProcess, RegistrerProducts> current : registerProducers.entrySet()) {
            for (Product currentProduct : current.getValue().getListOfProducts()) {
                if (currentProduct.equals(product)) {
                    return current.getKey();
                }
            }
        }
        return null;
    }
}

