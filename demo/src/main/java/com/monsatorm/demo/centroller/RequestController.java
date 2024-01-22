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

    @PostMapping("/create-request")
    void createRequest() {

    }

    @PutMapping("/close-request")
    void closeRequest() {

    }
}
