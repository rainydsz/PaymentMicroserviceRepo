/*
	@Created by Prashant,Tauseef,Tarun and Rainy
*/

package com.ecommerce.paymentservice.bridgepattern;

public class CCAvenue implements IPaymentGateway {

	@Override
	public String processPayment(String paymentSystem) {
		// TODO Auto-generated method stub
		
		System.out.println("Using CCAvenue gateway for: " + paymentSystem);

		String status = "SUCCESS";

		return status;
	}
}
