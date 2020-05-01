/*
	@Created by Prashant,Tauseef,Tarun and Rainy
 */
package com.ecommerce.paymentservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.paymentservice.adapter.PluggableAdapter;
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

		// Implementing the bridge design pattern
		AbstractPayment payment = new CreditPayment();
		
		
		payment.setPaymentgateway( new PluggableAdapter(new CCAvenue()));
		PaymentDetailsModel paymentdetails = payment.makePayment(order);

		if (paymentdetails.getStatus().equals("SUCCESS")) {
			paymentdao.update(paymentdetails, order);
		}
	}

}