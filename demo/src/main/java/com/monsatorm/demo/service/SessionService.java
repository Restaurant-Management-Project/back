package com.monsatorm.demo.service;

import lombok.Setter;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

public interface SessionService {
    void initSession(UUID sessionId, LocalDateTime dateTime);
    void updateSession();
}
