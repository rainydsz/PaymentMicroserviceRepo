/*
	@Created by Prashant,Tauseef,Tarun and Rainy
*/

package com.ecommerce.paymentservice.bridgepattern;

import com.ecommerce.paymentservice.model.PaymentDetailsModel;

public interface IPaymentGateway {
	public PaymentDetailsModel processPayment(String paymentSystem);
}
