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

	public PaymentController(PaymentService paymentService) {
		this.paymentService = paymentService;
	}

	@RequestMapping(method = RequestMethod.POST, value = "/checkout/payment", produces = "application/json")
	public void payment() {
		OrderModel order = new OrderModel();
		order.setId(1234567890);
		order.setUser_id("rainydsz");
		order.setOrder_details("Ordered 2 products");
		order.setOrder_total(1890.50);
		paymentService.pay(order.getId());
		return;
	}
}