package com.monsatorm.demo.centroller;

import com.monsatorm.demo.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/order-detail")
@RequiredArgsConstructor
@CrossOrigin("*")
public class OrderDetailController {
    private final OrderService orderService;
}
