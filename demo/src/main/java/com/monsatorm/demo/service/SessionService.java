package com.monsatorm.demo.service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.UUID;

public interface SessionService {
    void updateSessionTimeOrAddSession(String sessionId, Integer tableId, Integer orderId, Timestamp expirationTime);
}
