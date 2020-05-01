/**
 @author   Prashant, Tauseef, Tarun, Rainy
 @version  1.0
*/
package com.ecommerce.paymentservice.interceptor;

import java.util.Vector;

import com.ecommerce.paymentservice.model.PaymentDetailsModel;
import com.ecommerce.paymentservice.service.impl.PaymentServiceImpl;

public class Dispatcher {
	PaymentDetailsModel paymentDetailsModel;
	public Dispatcher(PaymentDetailsModel paymentDetailsModel )
	{
		this.paymentDetailsModel=paymentDetailsModel;
	}
	public Dispatcher( )
	{
		
	}
	
	Vector<Interceptor> interceptors_=new Vector<Interceptor>();
	
	public void dispatch()
	{
		for(int i=0;i<interceptors_.size();i++)
		{
			Interceptor ic=(Interceptor) interceptors_.elementAt(i);
			ic.doAction(paymentDetailsModel);
		}
	}
	public void register(Interceptor i)
	{
		interceptors_.addElement(i);
	}
	public void remove(Interceptor i)
	{
		interceptors_.removeElement(i);
	}
	public void iterate_list() {
		
	}

}

