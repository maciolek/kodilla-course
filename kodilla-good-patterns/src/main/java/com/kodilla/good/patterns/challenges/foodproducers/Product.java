package com.kodilla.good.patterns.challenges.foodproducers;

import java.math.BigDecimal;
import java.util.Objects;

public class Product {

    private String name;
    private BigDecimal price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = BigDecimal.valueOf(price);
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantityAfterSale(int volumeOfPurchase) {
        this.quantity = quantity-volumeOfPurchase;
    }

    @Override
    public String toString() {
        return "Nazwa produktu " + name +
                ", cena " + price +
                ", ilość " + quantity;
    }


}

