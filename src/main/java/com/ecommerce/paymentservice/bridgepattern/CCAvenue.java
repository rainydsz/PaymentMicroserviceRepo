/*
	@Created by Prashant,Tauseef,Tarun and Rainy
*/

package com.ecommerce.paymentservice.bridgepattern;

public class CCAvenue implements ICCAvenue {

	@Override
	public String makePayment(String paymentSystem) {

		return "SUCCESS";

	}
}
