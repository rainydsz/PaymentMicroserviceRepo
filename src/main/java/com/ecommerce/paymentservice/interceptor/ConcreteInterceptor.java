package com.ecommerce.paymentservice.interceptor;

import com.ecommerce.paymentservice.dao.PaymentDao;
import com.ecommerce.paymentservice.model.PaymentDetailsModel;

public class ConcreteInterceptor implements Interceptor {
	
	@Override
	public void doAction(PaymentDetailsModel paymentDetailsModel) {
		PaymentDao paymenTdao=new PaymentDao();
		paymenTdao.checkPaymentDetails(paymentDetailsModel);

	}
}
