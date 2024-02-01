package com.monsatorm.demo;

import com.monsatorm.demo.controller.RequestController;
import com.monsatorm.demo.service.impl.OrderDetailServiceImpl;
import com.monsatorm.demo.service.impl.OrderServiceImpl;
import com.monsatorm.demo.service.impl.SessionServiceImpl;
import org.hibernate.type.descriptor.java.LocalDateTimeJavaType;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cglib.core.Local;
import org.springframework.context.ConfigurableApplicationContext;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.UUID;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        RequestController req = context.getBean(RequestController.class);

//        SessionServiceImpl sessionService = context.getBean(SessionServiceImpl.class);
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSSSSS");
//
//        LocalDateTime dateTime = LocalDateTime.parse("2024-01-16 13:00:00.000000", formatter);
//
//        Timestamp timestamp = Timestamp.valueOf(dateTime);
//
//        UUID sessionId = UUID.randomUUID();
//
//        sessionService.updateSessionTimeOrAddSession(
//                "1567b402-9e50-4955-8879-aa95521a4dc2",
//                2,
//                null,
//                timestamp
//        );
    }
}
