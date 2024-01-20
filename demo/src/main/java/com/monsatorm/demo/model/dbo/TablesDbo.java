package com.monsatorm.demo.model.dbo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class TablesDbo {
    @Id
    @GeneratedValue
    private Long tableId;
    @Column(name = "tableuid", length = 150)
    private String tableUid;

}
