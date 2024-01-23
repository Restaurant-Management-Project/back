package com.monsatorm.demo.controller;

import com.monsatorm.demo.model.dbo.Order;
import com.monsatorm.demo.model.dto.request.ClientRequestDto;
import com.monsatorm.demo.model.dto.request.ManagerRequestDto;
import com.monsatorm.demo.service.ClientService;
import com.monsatorm.demo.service.ManagerService;
import com.monsatorm.demo.service.implementation.ClientServiceImpl;
import com.monsatorm.demo.service.implementation.ManagerServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.UUID;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class RequestController {
    private final ClientServiceImpl clientService = new ClientServiceImpl();
    private final ManagerServiceImpl managerService = new ManagerServiceImpl();

    @PostMapping("/client_action")
    public void getClientRequest(@RequestBody ClientRequestDto clientRequestDto) {

        //service call
    }
    @PostMapping("/manager_action")
    public void getManagerRequest(@RequestBody ManagerRequestDto managerRequestDto) {
        //service call
    }

    @GetMapping("/order_details")
    public String getOrder() {

        return "Hello"; //fow now
    }
}
