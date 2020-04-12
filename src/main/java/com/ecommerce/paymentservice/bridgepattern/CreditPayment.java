/*
	@Created by Prashant,Tauseef,Tarun and Rainy
*/

package com.ecommerce.paymentservice.bridgepattern;

public class CreditPayment extends AbstractPayment {

	@Override
	public void makePayment() {
		// TODO Auto-generated method stub
		payment_gateway.processPayment("Credit Card");
	}

}
