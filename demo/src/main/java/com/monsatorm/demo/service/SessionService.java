package com.monsatorm.demo.service;

import com.monsatorm.demo.model.dto.request.SessionOddUpdateRequestDto;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.OffsetTime;
import java.util.UUID;

public interface SessionService {
    void updateSessionTimeOrAddSession(SessionOddUpdateRequestDto sessionRequestDto);
    Boolean checkSessionExpiration(String sessionId);
}
