package com.monsatorm.demo.controller;

import com.monsatorm.demo.model.projections.OrderDetailDtoPImpl;
import com.monsatorm.demo.service.OrderDetailService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/order-detail")
@RequiredArgsConstructor
@CrossOrigin("*")
public class OrderDetailController {
    private final OrderDetailService orderDetailService;

    @GetMapping("/get-by-table/{tableId}/{orderId}")
    public List<OrderDetailDtoPImpl> getOrderDetailByTableId(@PathVariable("tableId") Integer tableId,
                                                             @PathVariable("orderId") String orderId) {
        return orderDetailService.getOrderDetailByTableId(tableId, orderId);
    }
}
