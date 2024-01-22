package com.monsatorm.demo.model.projections;

import lombok.*;

import java.math.BigDecimal;

@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetailDtoPImpl {
    private String productName;

    private Integer quantity;

    private BigDecimal price;

    private BigDecimal totalPrice;
}
