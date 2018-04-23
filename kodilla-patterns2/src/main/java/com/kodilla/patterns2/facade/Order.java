package com.kodilla.patterns2.facade;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private final List<Item> items = new ArrayList<>();
    private final Long orderId;
    private final Long userId;
    private ProductService productservice;
    private boolean isPaid = false;
    private boolean isVerified = false;
    private boolean isSubmitted = false;

    public Order(ProductService productservice, Long orderId, Long userId) {
        this.productservice = productservice;
        this.orderId = orderId;
        this.userId = userId;
    }

    public BigDecimal calculateValue() {
        BigDecimal sum = BigDecimal.ZERO;
        for (Item item : items) {
            sum.add(productservice.getPrice(item.getProductId())
                    .multiply(new BigDecimal(item.getQty())));
        }
        return sum;
    }

    public ProductService getProductservice() {
        return productservice;
    }

    public void setProductservice(ProductService productservice) {
        this.productservice = productservice;
    }

    public List<Item> getItems() {
        return items;
    }

    public Long getOrderId() {
        return orderId;
    }

    public Long getUserId() {
        return userId;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public boolean isVerified() {
        return isVerified;
    }

    public void setVerified(boolean verified) {
        isVerified = verified;
    }

    public boolean isSubmitted() {
        return isSubmitted;
    }

    public void setSubmitted(boolean submitted) {
        isSubmitted = submitted;
    }
}
