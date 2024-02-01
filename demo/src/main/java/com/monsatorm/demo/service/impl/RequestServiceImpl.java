package com.monsatorm.demo.service.impl;

import com.monsatorm.demo.repository.RequestRepository;
import com.monsatorm.demo.service.RequestService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RequestServiceImpl implements RequestService {
    private final RequestRepository requestRepository;

    @Override
    public void createRequest(String orderId, Integer requestTypeId) {
        requestRepository.createRequest(orderId, requestTypeId);
    }

    @Override
    public void closeRequest(Integer requestId) {
        requestRepository.closeRequest(requestId);
    }
}
