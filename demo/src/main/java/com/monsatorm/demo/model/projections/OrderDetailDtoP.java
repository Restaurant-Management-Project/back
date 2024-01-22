package com.monsatorm.demo.model.projections;

import java.math.BigDecimal;

public interface OrderDetailDtoP {
    String getProductName();

    Integer getQuantity();

    BigDecimal getPrice();

    BigDecimal getTotalPrice();
}
