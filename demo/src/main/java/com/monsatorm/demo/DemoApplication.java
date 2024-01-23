package com.monsatorm.demo;

import com.monsatorm.demo.model.projections.OrderDetailDtoP;
import com.monsatorm.demo.repository.OrderDetailRepository;
import com.monsatorm.demo.service.impl.OrderDetailServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        OrderDetailServiceImpl detailService = context.getBean(OrderDetailServiceImpl.class);
        detailService.getOrderDetailByTableId(1).forEach(orderDetailDtoP -> System.out.println(orderDetailDtoP.getProductName()));
        detailService.getOrderDetailByTableId(1).forEach(orderDetailDtoP -> System.out.println(orderDetailDtoP.getQuantity()));
        detailService.getOrderDetailByTableId(1).forEach(orderDetailDtoP -> System.out.println(orderDetailDtoP.getProductPrice()));
    }
}
