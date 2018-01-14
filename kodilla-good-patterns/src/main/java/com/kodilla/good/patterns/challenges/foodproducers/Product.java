package com.kodilla.good.patterns.challenges.foodproducers;

import java.math.BigDecimal;
import java.util.Objects;

public class Product {

    private String name;
    private BigDecimal price;
    private int quantity;
    private String nameOfProducer;

    public Product(String name, BigDecimal price, int quantity, String nameOfProducer) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.nameOfProducer = nameOfProducer;
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

    public String getNameOfProducer() {
        return nameOfProducer;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return quantity == product.quantity &&
                Objects.equals(name, product.name) &&
                Objects.equals(price, product.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
