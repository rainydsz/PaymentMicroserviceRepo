/*
	@Created by Prashant,Tauseef,Tarun and Rainy
*/
package com.ecommerce.paymentservice.bridgepattern;

public abstract class AbstractPayment {

	public IPaymentGateway payment_gateway;

	public abstract void makePayment();

}
