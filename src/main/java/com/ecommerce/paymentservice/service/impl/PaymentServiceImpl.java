/*
	@Created by Prashant,Tauseef,Tarun and Rainy
*/
package com.ecommerce.paymentservice.service.impl;

import org.springframework.stereotype.Service;

import com.ecommerce.paymentservice.bridgepattern.AbstractPayment;
import com.ecommerce.paymentservice.bridgepattern.CCAvenue;
import com.ecommerce.paymentservice.bridgepattern.CreditPayment;
import com.ecommerce.paymentservice.dao.PaymentDao;
import com.ecommerce.paymentservice.model.PaymentDetailsModel;
import com.ecommerce.paymentservice.service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService {

	@Override
	public void pay(long order_id) {
		// TODO Auto-generated method stub

		PaymentDao paymentdao = new PaymentDao();

		PaymentDetailsModel paymentdetails = new PaymentDetailsModel();

		AbstractPayment payment = new CreditPayment();
		payment.payment_gateway = new CCAvenue();
		payment.makePayment();

		if (paymentdetails.getStatus() == "SUCCESS") {
			paymentdao.update(paymentdetails.getStatus());
		}
	}

}