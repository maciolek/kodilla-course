package com.kodilla.good.patterns.challenges;

public class Product {

    private String nameOfProduct;
    private double priceOfProduct;

    public Product(String nameOfProduct, double priceOfProduct) {
        this.nameOfProduct = nameOfProduct;
        this.priceOfProduct = priceOfProduct;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public double getPriceOfProduct() {
        return priceOfProduct;
    }
}
