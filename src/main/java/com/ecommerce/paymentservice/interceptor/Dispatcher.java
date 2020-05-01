/**
 @author   Prashant, Tauseef, Tarun, Rainy
 @version  1.0
*/
package com.ecommerce.paymentservice.interceptor;

import java.util.Vector;

import com.ecommerce.paymentservice.model.PaymentDetailsModel;

public class Dispatcher {
	PaymentDetailsModel paymentDetailsModel;

	public Dispatcher(PaymentDetailsModel paymentDetailsModel) {
		this.paymentDetailsModel = paymentDetailsModel;
	}

	Vector<Interceptor> interceptors = new Vector<>();

	public void dispatch() {
		for (int i = 0; i < interceptors.size(); i++) {
			Interceptor ic = interceptors.elementAt(i);
			ic.doAction(paymentDetailsModel);
		}
	}

	public void register(Interceptor i) {
		interceptors.addElement(i);
	}

	public void remove(Interceptor i) {
		interceptors.removeElement(i);
	}

}
