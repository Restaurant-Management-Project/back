package com.monsatorm.demo.model.projections;

import lombok.*;

@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetailDtoPImpl {
    private String productName;

    private Integer quantity;

    private Integer price;

    private Integer totalPrice;
}
