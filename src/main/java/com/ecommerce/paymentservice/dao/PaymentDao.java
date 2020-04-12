/*
	@Created by Prashant,Tauseef,Tarun and Rainy
*/

package com.ecommerce.paymentservice.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.ecommerce.paymentservice.model.PaymentDetailsModel;

public class PaymentDao {
	public void update(String status) {
		
		@Autowired
		JdbcTemplate jdbcTemplate;
		
		PaymentDetailsModel paymentdetails=new PaymentDetailsModel();
		
		final String INSERT_QUERY = "insert into payment_details (payment_id, status, order_id, order_amount, order_details) values (?, ?, ?, ?, ?)";
		
		jdbcTemplate.update(INSERT_QUERY, paymentdetails.getPayment_id(), status, paymentdetails.getOrder_id(), paymentdetails.getOrder_amount(), paymentdetails.getOrder_details());
	}
}
