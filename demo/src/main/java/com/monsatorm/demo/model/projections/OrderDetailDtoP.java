package com.monsatorm.demo.model.projections;

public interface OrderDetailDtoP {
    Integer getOrderId();
    String getProductName();

    Integer getQuantity();

    Double getProductPrice();
}
