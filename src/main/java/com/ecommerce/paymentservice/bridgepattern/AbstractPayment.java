/*
	@Created by Prashant,Tauseef,Tarun and Rainy
*/
package com.ecommerce.paymentservice.bridgepattern;

import com.ecommerce.paymentservice.model.OrderModel;
import com.ecommerce.paymentservice.model.PaymentDetailsModel;

public abstract class AbstractPayment {

	// Adding a reference to the payment gateway interface
	public IPaymentGateway payment_gateway;

	public abstract PaymentDetailsModel makePayment(OrderModel order);

}
