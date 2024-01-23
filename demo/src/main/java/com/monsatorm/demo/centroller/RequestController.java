package com.monsatorm.demo.centroller;

import com.monsatorm.demo.service.RequestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/request")
@RequiredArgsConstructor
@CrossOrigin("*")
public class RequestController {
    private RequestService requestService;

    @PostMapping("/create-request/{orderId}/{requestTypeId}")
    void createRequest(@PathVariable("orderId") Integer orderId, @PathVariable("requestTypeId") Integer requestTypeId) {
        requestService.createRequest(orderId, requestTypeId);
    }

    @PutMapping("/close-request/{requestId}")
    void closeRequest(@PathVariable("requestId") Integer requestId) {
        requestService.closeRequest(requestId);
    }
}