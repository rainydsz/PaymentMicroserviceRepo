/**
 @author   Prashant, Tauseef, Tarun, Rainy
 @version  1.0
*/
package com.ecommerce.paymentservice.interceptor;

import com.ecommerce.paymentservice.dao.PaymentDao;
import com.ecommerce.paymentservice.model.PaymentDetailsModel;
import com.ecommerce.paymentservice.service.impl.PaymentServiceImpl;

public class ConcreteInterceptor implements Interceptor {

	@Override
	public void doAction(PaymentDetailsModel paymentDetailsModel) {
		PaymentDao paymentDao=new PaymentDao();
		paymentDao.checkPaymentDetails(paymentDetailsModel);
		}
	
}

