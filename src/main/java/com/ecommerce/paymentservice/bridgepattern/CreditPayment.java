/*
	@Created by Prashant,Tauseef,Tarun and Rainy
*/

package com.ecommerce.paymentservice.bridgepattern;

import com.ecommerce.paymentservice.model.OrderModel;
import com.ecommerce.paymentservice.model.PaymentDetailsModel;

public class CreditPayment extends AbstractPayment {

	@Override
	public PaymentDetailsModel makePayment(OrderModel order) {

		PaymentDetailsModel paymentdetails = new PaymentDetailsModel();

		paymentgateway.processPayment("Credit Card");

		// Checking the payment status

		paymentdetails.setStatus(PaymentDetailsModel.SUCCESS);
		paymentdetails.setPaymentId(12345);
		return paymentdetails;
	}

}
