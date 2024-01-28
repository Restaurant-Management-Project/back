package com.monsatorm.demo;

import com.monsatorm.demo.service.impl.OrderDetailServiceImpl;
import com.monsatorm.demo.service.impl.OrderServiceImpl;
import com.monsatorm.demo.service.impl.SessionServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.UUID;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        SessionServiceImpl sessionService = context.getBean(SessionServiceImpl.class);
//        sessionService.updateSessionTimeOrAddSession(
//                "8e101d0a-8f2e-4da9-94eb-894c6d1933ad",
//                2,
//                5,
//                null);
    }
}
