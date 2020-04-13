/*
	@Created by Prashant,Tauseef,Tarun and Rainy
*/

package com.ecommerce.paymentservice.bridgepattern;

public interface IPaymentGateway {
	public String processPayment(String paymentSystem);
}
