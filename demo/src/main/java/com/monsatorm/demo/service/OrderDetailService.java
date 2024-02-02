package com.monsatorm.demo.service;

import com.monsatorm.demo.model.projections.OrderDetailDtoPImpl;

import java.util.List;

public interface OrderDetailService {
    List<OrderDetailDtoPImpl> getOrderDetailByTableId(Integer tableId, String orderId);
}
