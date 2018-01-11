package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class SaleRequest {

    private User user;
    private int quantity;
    private LocalDate dateOfSale;
    private Product product;
    private String adress;

    public SaleRequest(User user, int quantity, LocalDate dateOfSale, Product product) {
        this.user = user;
        this.quantity = quantity;
        this.dateOfSale = dateOfSale;
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public int getQuantity() {
        return quantity;
    }

    public LocalDate getDateOfSale() {
        return dateOfSale;
    }

    public Product getProduct() {
        return product;
    }
}
