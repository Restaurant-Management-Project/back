package com.monsatorm.demo;

import com.monsatorm.demo.service.impl.SessionServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        SessionServiceImpl sessionService = context.getBean(SessionServiceImpl.class);
        String str = "1986-04-08 12:30";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime dateTime = LocalDateTime.parse(str, formatter);
        Timestamp now = Timestamp.valueOf(dateTime);
//        OffsetTime offsetTime = OffsetTime.now();
//
        sessionService.updateSessionTimeOrAddSession(
                "8e101d0a-8f2e-4da9-94eb-894c6d1933bd",
                3,
                "755d6203-b419-443c-803b-1412ec67b0b6",
//                "c6fbc96b-4652-4c8e-a93d-fe589e1358df",
                now);
    }
}
