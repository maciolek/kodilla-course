package com.kodilla.good.patterns.challenges;

public class Product {

    private String category;
    private String nameOfProduct;
    private double priceOfProduct;

    public Product(String category, String nameOfProduct, double priceOfProduct) {
        this.category = category;
        this.nameOfProduct = nameOfProduct;
        this.priceOfProduct = priceOfProduct;
    }

    public String getCategory() {
        return category;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public double getPriceOfProduct() {
        return priceOfProduct;
    }
}
