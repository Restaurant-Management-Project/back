package com.monsatorm.demo.service;

import org.springframework.data.repository.query.Param;

public interface RequestService {
    void createRequest(String orderId, Integer requestTypeId);
    void closeRequest(Integer requestId);
}
