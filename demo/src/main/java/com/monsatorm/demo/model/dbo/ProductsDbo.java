package com.monsatorm.demo.model.dbo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class ProductsDbo {
    @Id
    @GeneratedValue
    private Long productId;

}
