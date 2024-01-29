package com.monsatorm.demo.model.dbo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name="session")
public class SessionDbo {
    @Id
    @GeneratedValue
    private UUID sessionId;
    private Integer tableId;
    private LocalDateTime startTime;
    private LocalDateTime expirationTime;
}
