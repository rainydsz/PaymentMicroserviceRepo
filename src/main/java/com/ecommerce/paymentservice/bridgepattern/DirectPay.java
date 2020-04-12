/*
	@Created by Prashant,Tauseef,Tarun and Rainy
*/
package com.ecommerce.paymentservice.bridgepattern;

import com.ecommerce.paymentservice.model.OrderModel;
import com.ecommerce.paymentservice.model.PaymentDetailsModel;

public class DirectPay implements IPaymentGateway {

	@Override
	public PaymentDetailsModel processPayment(String paymentSystem) {
		// TODO Auto-generated method stub
		PaymentDetailsModel paymentdetails = new PaymentDetailsModel();
		System.out.println("Using DirectPay gateway for" + paymentSystem);

		OrderModel order = new OrderModel();
		paymentdetails.setStatus(PaymentDetailsModel.SUCCESS);
		paymentdetails.setPayment_id(12345);
		paymentdetails.setOrder_id(order.getId());
		paymentdetails.setOrder_amount(order.getOrder_total());
		paymentdetails.setOrder_details(order.getOrder_details());
		return paymentdetails;
	}

}
