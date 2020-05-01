/*
	@Created by Prashant,Tauseef,Tarun and Rainy
*/
package com.ecommerce.paymentservice.bridgepattern;

import com.ecommerce.paymentservice.model.OrderModel;
import com.ecommerce.paymentservice.model.PaymentDetailsModel;

public abstract class AbstractPayment {

	protected IPaymentGateway paymentgateway;
	
	

	public IPaymentGateway getPaymentgateway() {
		return paymentgateway;
	}



	public void setPaymentgateway(IPaymentGateway paymentgateway) {
		this.paymentgateway = paymentgateway;
	}



	public abstract PaymentDetailsModel makePayment(OrderModel order);

}
