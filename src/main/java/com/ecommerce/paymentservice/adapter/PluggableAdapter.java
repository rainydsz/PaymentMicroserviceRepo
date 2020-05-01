/**
 @author   Prashant, Tauseef, Tarun, Rainy
 @version  1.0
*/
package com.ecommerce.paymentservice.adapter;

import com.ecommerce.paymentservice.bridgepattern.ICCAvenue;
import com.ecommerce.paymentservice.bridgepattern.IPaymentGateway;

public class PluggableAdapter implements IPaymentGateway{
	IPaymentGateway directPay;
	ICCAvenue ccavenue;
	
	public PluggableAdapter(ICCAvenue ccavenue)
	{
		this.ccavenue=ccavenue;
	}
	public PluggableAdapter(IPaymentGateway directPay)
	{
		this.directPay=directPay;
	}
	public String processPayment(String paymentSystem) {
		String status;
		
		if(ccavenue!=null)
		{
			status=ccavenue.makePayment(paymentSystem);
		}
		else
		{
			status=directPay.processPayment(paymentSystem);
		}

		return status;
	}
	

}

