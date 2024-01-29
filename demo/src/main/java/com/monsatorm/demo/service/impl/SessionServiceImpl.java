package com.monsatorm.demo.service.impl;

import com.monsatorm.demo.repository.SessionRepository;
import com.monsatorm.demo.service.SessionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class SessionServiceImpl implements SessionService {
    private final SessionRepository sessionRepository;

    @Override
    public void initSession(UUID sessionId, LocalDateTime dateTime) {
        sessionRepository.initSession();

    }

    @Override
    public void updateSession() {

    }
}
