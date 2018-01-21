package com.kodilla.good.patterns.challenges.foodproducers;

import java.time.LocalDate;

public class Order {

    private User user;
    private LocalDate dateOfSale;
    private Product product;
    private int volumeOfPurchase;

    public Order(User user, LocalDate dateOfSale, Product product, int volumeOfPurchase) {
        this.user = user;
        this.dateOfSale = dateOfSale;
        this.product = product;
        this.volumeOfPurchase = volumeOfPurchase;
    }

    public User getUser() {
        return user;
    }

    public LocalDate getDateOfSale() {
        return dateOfSale;
    }

    public Product getProduct() {
        return product;
    }

    public int getVolumeOfPurchase() {
        return volumeOfPurchase;
    }
}
