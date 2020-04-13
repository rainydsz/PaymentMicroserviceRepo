/*
	@Created by Prashant,Tauseef,Tarun and Rainy
*/
package com.ecommerce.paymentservice.bridgepattern;

public class DirectPay implements IPaymentGateway {

	@Override
	public String processPayment(String paymentSystem) {
		// TODO Auto-generated method stub
		
		System.out.println("Using DirectPay gateway for: " + paymentSystem);

		String status = "Success";

		return status;
	}

}
