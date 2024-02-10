package com.monsatorm.demo.controller;

import com.monsatorm.demo.service.RequestService;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;

@Controller
public class WebSocketController {
    private final RequestService requestService;

    public WebSocketController(RequestService requestService) {
        this.requestService = requestService;
    }

    @MessageMapping("/recent-requests")
    public void handleNewRequest() {
        requestService.broadcastRecentRequests();
    }
}
