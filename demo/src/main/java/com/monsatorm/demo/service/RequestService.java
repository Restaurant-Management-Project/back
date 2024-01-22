package com.monsatorm.demo.service;

import org.springframework.data.repository.query.Param;

public interface RequestService {
    void createRequest(Integer orderId, Integer requestTypeId);
    void closeRequest(Integer requestId);
}
