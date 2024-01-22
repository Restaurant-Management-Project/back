package com.monsatorm.demo;

import com.monsatorm.demo.model.projections.OrderDetailDtoPImpl;
import com.monsatorm.demo.service.OrderDetailService;
import com.monsatorm.demo.service.impl.OrderDetailServiceImpl;
import com.monsatorm.demo.service.impl.OrderServiceImpl;
import com.monsatorm.demo.service.impl.RequestServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
//		OrderDetailServiceImpl detailService = context.getBean(OrderDetailServiceImpl.class);
//		detailService.getOrderDetailByTableId(4).forEach(orderDetailDtoP -> System.out.println(orderDetailDtoP.getProductName()));
//		detailService.getOrderDetailByTableId(4).forEach(orderDetailDtoP -> System.out.println(orderDetailDtoP.getQuantity()));
//		detailService.getOrderDetailByTableId(4).forEach(orderDetailDtoP -> System.out.println(orderDetailDtoP.getPrice()));
//		detailService.getOrderDetailByTableId(4).forEach(orderDetailDtoP -> System.out.println(orderDetailDtoP.getTotalPrice()));
		OrderServiceImpl orderService = context.getBean(OrderServiceImpl.class);
		RequestServiceImpl requestService = context.getBean(RequestServiceImpl.class);
		orderService.closeOrder(8);
		requestService.createRequest(2, 1);
		requestService.closeRequest(13);

	}
}
