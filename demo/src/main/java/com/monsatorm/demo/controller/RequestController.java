package com.monsatorm.demo.controller;

import com.monsatorm.demo.model.dbo.Order;
import com.monsatorm.demo.model.dto.request.ClientRequestDto;
import com.monsatorm.demo.model.dto.request.ManagerRequestDto;
import com.monsatorm.demo.model.projections.OrderDetailDtoPImpl;
import com.monsatorm.demo.service.*;
import com.monsatorm.demo.service.implementation.ClientServiceImpl;
import com.monsatorm.demo.service.implementation.ManagerServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.UUID;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class RequestController {
    private final OrderService orderService;
    private final OrderDetailService orderDetailService;
    private RequestService requestService;


    @PutMapping("/close-order/{orderId}")
    void closeOrder(@PathVariable("orderId") Integer orderId){
        orderService.closeOrder(orderId);
    }

    @GetMapping("/get-by-table/{tableId}")
    public List<OrderDetailDtoPImpl> getOrderDetailByTableId(@PathVariable("tableId") Integer tableId) {
        return orderDetailService.getOrderDetailByTableId(tableId);
    }

    @PostMapping("/create-request/{orderId}/{requestTypeId}")
    void createRequest(@PathVariable("orderId") Integer orderId, @PathVariable("requestTypeId") Integer requestTypeId) {
        requestService.createRequest(orderId, requestTypeId);
    }

    @PutMapping("/close-request/{requestId}")
    void closeRequest(@PathVariable("requestId") Integer requestId) {
        requestService.closeRequest(requestId);
    }

}
