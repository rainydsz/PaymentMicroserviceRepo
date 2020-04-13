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

		paymentdetails.setOrder_id(order.getId());
		paymentdetails.setOrder_amount(order.getOrder_total());
		paymentdetails.setOrder_details(order.getOrder_details());

		jdbcTemplate.update(INSERT_QUERY, paymentdetails.getPayment_id(), paymentdetails.getStatus(),
				paymentdetails.getOrder_id(), paymentdetails.getOrder_amount(), paymentdetails.getOrder_details());
	}
}
