/*
	@Created by Prashant,Tauseef,Tarun and Rainy
*/
package com.ecommerce.paymentservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.paymentservice.model.OrderModel;
import com.ecommerce.paymentservice.service.PaymentService;

@RestController
@RequestMapping(value = "/payment-microservice")
public class PaymentController {

	@Autowired
	PaymentService paymentService;
	
	@GetMapping(path = "/checkout/payment")
	public void payment() {

		// Getting the order details from checkout service
		OrderModel order = new OrderModel();
		order.setOrderId(1234567890);
		order.setUserId("rainydsz");
		order.setOrderDetails("Groceries for the entire month");
		order.setOrderTotal(1890.50);

		// Calling the service class method
		paymentService.pay(order);
	}
}