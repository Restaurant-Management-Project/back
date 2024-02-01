package com.monsatorm.demo.controller;

import com.monsatorm.demo.model.dto.request.ClientRequestDto;
import com.monsatorm.demo.model.projections.NoIdOrderDetailDtoPImpl;
import com.monsatorm.demo.model.projections.OrderDetailDtoPImpl;
import com.monsatorm.demo.service.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
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
    private final RequestService requestService;
    private final OrderService orderService;
    private final OrderDetailService orderDetailService;
    private final SessionService sessionService;
    private final CookieService cookieService;

    @GetMapping("/init-session/{tableId}")
    public String initSession(@PathVariable("tableId") Integer tableId, HttpServletRequest request,
                               HttpServletResponse response)  {
        String sessionId = cookieService.checkUserCookies(request, response);
        boolean sessionStatus = sessionService.checkSessionExpiration(sessionId);
        //todo present valid || present expired || absent

        if(!sessionStatus) {
            sessionService.updateSessionTimeOrAddSession(sessionId, tableId, "6b55d095-932e-4e2a-a388-ca3f1d6258f1", null);
        }
        return "redirect:/home";
    }

    @GetMapping("/home")
    String  homePage() {
        //todo return main page
        return "homeeeee";
    }
    @PostMapping("/create-request/{orderId}/{requestTypeId}")
    void createRequest(@PathVariable("orderId") String orderId, @PathVariable("requestTypeId") Integer requestTypeId,
                       @RequestBody ClientRequestDto clientRequestDto) {

//        requestService.createRequest(orderId, requestTypeId);
        requestService.createRequest(clientRequestDto.getOrderId(), clientRequestDto.getRequestTypeId());
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

    //test
    @GetMapping("/{tableId}")
    public String getOrderId(@PathVariable("tableId") Integer tableId) {
        List<NoIdOrderDetailDtoPImpl> orderDetails = orderDetailService.getOrderDetailByOnlyTableId(tableId);
        return !orderDetails.isEmpty() ? orderDetails.get(0).getOrderId() : null;
    }
}