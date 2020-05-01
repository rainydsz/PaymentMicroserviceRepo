/*
	@Created by Prashant,Tauseef,Tarun and Rainy
*/

package com.ecommerce.paymentservice.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.ecommerce.paymentservice.model.OrderModel;
import com.ecommerce.paymentservice.model.PaymentDetailsModel;

@Component
public class PaymentDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public void update(PaymentDetailsModel paymentdetails, OrderModel order) {

		final String INSERT_QUERY = "insert into payment_details (payment_id, status, order_id, order_amount, order_details) values (?, ?, ?, ?, ?)";

		paymentdetails.setOrderId(order.getOrderId());
		paymentdetails.setOrderAmount(order.getOrderTotal());
		paymentdetails.setOrderDetails(order.getOrderDetails());

		jdbcTemplate.update(INSERT_QUERY, paymentdetails.getPaymentId(), paymentdetails.getStatus(),
				paymentdetails.getOrderId(), paymentdetails.getOrderAmount(), paymentdetails.getOrderDetails());
	}

	public void checkPaymentDetails(PaymentDetailsModel paymentDetailsModel) {
		//Do nothing because database gets updated
	}

}
