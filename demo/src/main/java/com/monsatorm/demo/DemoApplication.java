package com.monsatorm.demo;

import com.monsatorm.demo.model.projections.OrderDetailDtoPImpl;
import com.monsatorm.demo.service.OrderDetailService;
import com.monsatorm.demo.service.impl.SessionServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        SessionServiceImpl sessionService = context.getBean(SessionServiceImpl.class);
        OrderDetailService detailService = context.getBean(OrderDetailService.class);
        Boolean b = sessionService.checkSessionExpiration("58588313-4ced-46a5-9a05-3ce06e449ee4");
        System.out.println(b);
        List<OrderDetailDtoPImpl> orderDetailByTableId = detailService.getOrderDetailByTableId(1, null);
        System.out.println();

    }
}
