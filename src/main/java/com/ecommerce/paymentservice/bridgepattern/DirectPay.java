/*
	@Created by Prashant,Tauseef,Tarun and Rainy
*/
package com.ecommerce.paymentservice.bridgepattern;

public class DirectPay implements IPaymentGateway {

	@Override
	public String processPayment(String paymentSystem) {

		return "Success";
	}

}
