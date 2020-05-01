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


import com.ecommerce.paymentservice.interceptor.ConcreteFrameworkObserver;

@Entity
@Table(name = "payment_details")
public class PaymentDetailsModel {

	public static final String SUCCESS = "SUCCESS";

	public static final String FAILURE = "FAILURE";

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "payment_id")
	private long paymentId;

	@Column(name = "status")
	private String status;

	@Column(name = "order_id")
	private long orderId;

	@Column(name = "order_amount")
	private Double orderAmount;

	@Column(name = "order_details")
	private String orderDetails;

	ConcreteFrameworkObserver observer = new ConcreteFrameworkObserver();

	public long getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(long paymentId) {
		this.paymentId = paymentId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public Double getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(Double orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(String orderDetails) {
		this.orderDetails = orderDetails;
	}

	public void notifyObserver() {
		observer.update(this);
	}

}
