package com.kodilla.good.patterns.challenges.producers;

import java.util.Objects;

public class Product {

    private String nameOfProduct;
    private double price;
    private int quantity;

    public Product(String nameOfProduct, double price, int quantity) {
        this.nameOfProduct = nameOfProduct;
        this.price = price;
        this.quantity = quantity;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 &&
                quantity == product.quantity &&
                Objects.equals(nameOfProduct, product.nameOfProduct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfProduct);
    }
}
