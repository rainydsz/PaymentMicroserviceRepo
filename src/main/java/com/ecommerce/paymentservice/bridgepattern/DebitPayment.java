/*
	@Created by Prashant,Tauseef,Tarun and Rainy
*/

package com.ecommerce.paymentservice.bridgepattern;

import com.ecommerce.paymentservice.model.OrderModel;
import com.ecommerce.paymentservice.model.PaymentDetailsModel;

public class DebitPayment extends AbstractPayment {

	@Override
	public PaymentDetailsModel makePayment(OrderModel order) {
		// TODO Auto-generated method stub

		PaymentDetailsModel paymentdetails = new PaymentDetailsModel();

		String processstatus = payment_gateway.processPayment("Debit Card");

		// Checking the payment status
		paymentdetails.setStatus(PaymentDetailsModel.SUCCESS);
		if (processstatus.contentEquals(paymentdetails.getStatus())) {
			System.out.println("Payment successful for order id: " + order.getId());
		}
		paymentdetails.setPayment_id(12345);
		return paymentdetails;
	}
}
