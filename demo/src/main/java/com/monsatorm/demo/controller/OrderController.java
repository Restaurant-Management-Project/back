package com.monsatorm.demo.controller;

import com.monsatorm.demo.repository.OrderRepository;
import com.monsatorm.demo.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/order")
@RequiredArgsConstructor
@CrossOrigin("*")
public class OrderController {
    private final OrderService orderService;

    @PutMapping("/close-order/{orderId}")
    void closeOrder(@PathVariable("orderId") String orderId){
        orderService.closeOrder(orderId);
    }
}
