/*
	@Created by Prashant,Tauseef,Tarun and Rainy
*/

package com.ecommerce.paymentservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "payment_details")
public class PaymentDetailsModel {

	public static final String SUCCESS = "SUCCESS";

	public static final String FAILURE = "FAILURE";

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "payment_id")
	private long payment_id;

	@Column(name = "status")
	private String status;

	@Column(name = "order_id")
	private long order_id;

	@Column(name = "order_amount")
	private Double order_amount;

	@Column(name = "order_details")
	private String order_details;

	public long getPayment_id() {
		return payment_id;
	}

	public void setPayment_id(long payment_id) {
		this.payment_id = payment_id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public long getOrder_id() {
		return order_id;
	}

	public void setOrder_id(long order_id) {
		this.order_id = order_id;
	}

	public String getOrder_details() {
		return order_details;
	}

	public void setOrder_details(String order_details) {
		this.order_details = order_details;
	}

	public Double getOrder_amount() {
		return order_amount;
	}

	public void setOrder_amount(Double double1) {
		this.order_amount = double1;
	}

}
