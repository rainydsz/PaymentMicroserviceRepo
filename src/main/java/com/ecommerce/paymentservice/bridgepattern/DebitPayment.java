/*
	@Created by Prashant,Tauseef,Tarun and Rainy
*/

package com.ecommerce.paymentservice.bridgepattern;

public class DebitPayment extends AbstractPayment {

	@Override
	public void makePayment() {
		// TODO Auto-generated method stub
		payment_gateway.processPayment("Debit Card");
	}

}
