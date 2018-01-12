package com.kodilla.good.patterns.challenges.producers;

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

}
