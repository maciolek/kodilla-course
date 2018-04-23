package com.kodilla.patterns2.facade.API;

public class ItemDto {

    private final Long productId;
    private final double qty;

    public ItemDto(Long productId, double qty) {
        this.productId = productId;
        this.qty = qty;
    }

    public Long getProductId() {
        return productId;
    }

    public double getQty() {
        return qty;
    }
}
