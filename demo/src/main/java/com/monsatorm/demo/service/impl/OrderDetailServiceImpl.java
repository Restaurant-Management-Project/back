package com.monsatorm.demo.service.impl;

import com.monsatorm.demo.model.projections.OrderDetailDtoPImpl;
import com.monsatorm.demo.repository.OrderDetailRepository;
import com.monsatorm.demo.service.OrderDetailService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderDetailServiceImpl implements OrderDetailService {
    private final OrderDetailRepository orderDetailRepository;

    @Override
    public List<OrderDetailDtoPImpl> getOrderDetailByTableId(Integer tableId) {
        return orderDetailRepository.getOrderDetailByTableId(tableId).stream()
                .map(orderDetailDtoP -> OrderDetailDtoPImpl.builder()
                        .totalPrice(orderDetailDtoP.getTotalPrice())
                        .price(orderDetailDtoP.getPrice())
                        .productName(orderDetailDtoP.getProductName())
                        .quantity(orderDetailDtoP.getQuantity())
                        .build())
                .toList();
    }
}
