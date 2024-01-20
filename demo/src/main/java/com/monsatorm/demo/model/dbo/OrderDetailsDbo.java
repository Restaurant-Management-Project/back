package com.monsatorm.demo.model.dbo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class OrderDetailsDbo {
    @Id
    @GeneratedValue
    private Long orderDetailsId;
}
