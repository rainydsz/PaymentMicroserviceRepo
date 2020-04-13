/*
	@Created by Prashant,Tauseef,Tarun and Rainy
*/
package com.ecommerce.paymentservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.paymentservice.model.OrderModel;
import com.ecommerce.paymentservice.service.PaymentService;

@RestController
@RequestMapping(value = "/payment-microservice")
public class PaymentController {

	@Autowired
	PaymentService paymentService;

	@RequestMapping(method = RequestMethod.POST, value = "/checkout/payment", produces = "application/json")
	public void payment() {

		// Getting the order details from checkout service
		OrderModel order = new OrderModel();
		order.setId(1234567890);
		order.setUser_id("rainydsz");
		order.setOrder_details("Groceries for the entire month");
		order.setOrder_total(1890.50);

		// Calling the service class method
		paymentService.pay(order);
	}
}