/**
 @author   Prashant, Tauseef, Tarun, Rainy
 @version  1.0
*/
package com.ecommerce.paymentservice.interceptor;

import com.ecommerce.paymentservice.model.PaymentDetailsModel;

public interface Interceptor {
	
  public void doAction(PaymentDetailsModel paymentDetailsModel);
  
  
}

