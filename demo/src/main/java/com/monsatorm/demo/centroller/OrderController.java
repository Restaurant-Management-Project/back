package com.monsatorm.demo.centroller;

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

    @PutMapping("/close-order")
    void closeOrder(){

    }
}
