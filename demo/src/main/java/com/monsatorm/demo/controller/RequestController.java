package com.monsatorm.demo.controller;

import com.monsatorm.demo.model.projections.OrderDetailDtoPImpl;
import com.monsatorm.demo.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class RequestController {
    private final OrderService orderService;
    private final OrderDetailService orderDetailService;
    private final RequestService requestService;
    private final SessionService sessionService;

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

    @GetMapping("/init_session")
    public UUID initSession() {
        UUID newSession = UUID.randomUUID();
        sessionService.initSession(newSession, null);
        return newSession;
    }

}
