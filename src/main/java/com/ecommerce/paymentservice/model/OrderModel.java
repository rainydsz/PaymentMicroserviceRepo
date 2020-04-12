/*
	@Created by Prashant,Tauseef,Tarun and Rainy
*/
package com.ecommerce.paymentservice.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class OrderModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "order_id")
	private long order_id;

	@Column(name = "user_id")
	private String user_id;

	@Column(name = "order_details")
	private String order_details;

	@Column(name = "order_time")
	private Timestamp order_time;

	@Column(name = "order_total")
	private Double order_total;

	public long getId() {
		return order_id;
	}

	public void setId(long id) {
		this.order_id = id;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getOrder_details() {
		return order_details;
	}

	public void setOrder_details(String order_details) {
		this.order_details = order_details;
	}

	public Timestamp getOrder_time() {
		return order_time;
	}

	public void setOrder_time(Timestamp order_time) {
		this.order_time = order_time;
	}

	public Double getOrder_total() {
		return order_total;
	}

	public void setOrder_total(Double order_total) {
		this.order_total = order_total;
	}
}