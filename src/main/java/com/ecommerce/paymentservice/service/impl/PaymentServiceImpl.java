/*
	@Created by Prashant,Tauseef,Tarun and Rainy
*/
package com.ecommerce.paymentservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.paymentservice.bridgepattern.AbstractPayment;
import com.ecommerce.paymentservice.bridgepattern.CCAvenue;
import com.ecommerce.paymentservice.bridgepattern.CreditPayment;
import com.ecommerce.paymentservice.dao.PaymentDao;
import com.ecommerce.paymentservice.model.OrderModel;
import com.ecommerce.paymentservice.model.PaymentDetailsModel;
import com.ecommerce.paymentservice.service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService {

	@Autowired
	PaymentDao paymentdao;

	@Override
	public void pay(OrderModel order) {
		// TODO Auto-generated method stub

		// Implementing the bridge design pattern
		AbstractPayment payment = new CreditPayment();
		payment.payment_gateway = new CCAvenue();
		PaymentDetailsModel paymentdetails = payment.makePayment(order);

		System.out.println("Payment status is: " + paymentdetails.getStatus());

		if (paymentdetails.getStatus() == "SUCCESS") {
			paymentdao.update(paymentdetails, order);
		}
	}

}