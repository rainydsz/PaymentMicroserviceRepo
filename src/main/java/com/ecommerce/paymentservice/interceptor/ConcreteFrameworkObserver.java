/**
 @author   Prashant, Tauseef, Tarun, Rainy
 @version  1.0
*/
package com.ecommerce.paymentservice.interceptor;

import com.ecommerce.paymentservice.model.PaymentDetailsModel;
public class ConcreteFrameworkObserver {
	public void update(PaymentDetailsModel paymentDetailsModel) {
		Dispatcher dispatcher=new Dispatcher(paymentDetailsModel);
		ConcreteInterceptor concreteInterceptor=new ConcreteInterceptor();
		dispatcher.register(concreteInterceptor);
		dispatcher.dispatch();
	   }
}

