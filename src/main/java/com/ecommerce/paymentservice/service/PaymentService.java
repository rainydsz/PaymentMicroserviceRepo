/*
	@Created by Prashant,Tauseef,Tarun and Rainy
*/

package com.ecommerce.paymentservice.service;

import com.ecommerce.paymentservice.model.OrderModel;

public interface PaymentService {
	public void pay(OrderModel order);
}
