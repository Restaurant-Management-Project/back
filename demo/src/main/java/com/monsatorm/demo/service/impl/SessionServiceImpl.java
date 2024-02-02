package com.monsatorm.demo.service.impl;

import com.monsatorm.demo.model.dto.request.SessionOddUpdateRequestDto;
import com.monsatorm.demo.repository.SessionRepository;
import com.monsatorm.demo.service.SessionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.OffsetTime;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class SessionServiceImpl implements SessionService {
    private final SessionRepository sessionRepository;

    @Override
    public void updateSessionTimeOrAddSession(SessionOddUpdateRequestDto sessionRequestDto) {
        sessionRepository.test(
                sessionRequestDto.getSessionId(),
                sessionRequestDto.getTableId(),
                sessionRequestDto.getOrderId(),
                sessionRequestDto.getExpirationTime()
        );
    }

    @Override
    public Boolean checkSessionExpiration(String sessionId) {
        return sessionRepository.checkSessionExpiration(sessionId);
    }
}
