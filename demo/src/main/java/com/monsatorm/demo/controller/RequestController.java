package com.monsatorm.demo.controller;

import com.monsatorm.demo.model.projections.NoIdOrderDetailDtoPImpl;
import com.monsatorm.demo.model.projections.OrderDetailDtoPImpl;
import com.monsatorm.demo.service.OrderDetailService;
import com.monsatorm.demo.service.OrderService;
import com.monsatorm.demo.service.RequestService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1")
@RequiredArgsConstructor
@CrossOrigin("*")
public class RequestController {
    private RequestService requestService;
    private final OrderService orderService;
    private final OrderDetailService orderDetailService;

    @PostMapping("/create-request/{orderId}/{requestTypeId}")
    void createRequest(@PathVariable("orderId") String orderId, @PathVariable("requestTypeId") Integer requestTypeId) {
        requestService.createRequest(orderId, requestTypeId);
    }
    @PutMapping("/close-request/{requestId}")
    void closeRequest(@PathVariable("requestId") Integer requestId) {
        requestService.closeRequest(requestId);
    }

    @PutMapping("/close-order/{orderId}")
    void closeOrder(@PathVariable("orderId") String orderId){
        orderService.closeOrder(orderId);
    }
    @GetMapping("/get-by-table-and-id/{tableId}/{orderId}")
    public List<OrderDetailDtoPImpl> getOrderDetailByTableId(@PathVariable("tableId") Integer tableId,
                                                             @PathVariable("orderId") Optional<String> orderId) {
        return orderDetailService.getOrderDetailByTableId(tableId, orderId);
    }
    @GetMapping("/get-by-table/{tableId}")
    public List<NoIdOrderDetailDtoPImpl> getOrderDetailByTableIdNoId(@PathVariable("tableId") Integer tableId) {

        return orderDetailService.getOrderDetailByOnlyTableId(tableId);
    }

    @GetMapping("/{tableId}")
    public String getOrderId(@PathVariable("tableId") Integer tableId) {
        List<NoIdOrderDetailDtoPImpl> orderDetails = orderDetailService.getOrderDetailByOnlyTableId(tableId);
        return !orderDetails.isEmpty() ? orderDetails.get(0).getOrderId() : null;
    }
}