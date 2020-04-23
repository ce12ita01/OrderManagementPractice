package com.ordermanagement.app.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.BatchSize;

@Entity
@Table(name = "ORDERS")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ORDER_ID")
	long orderId;

	@Column(name = "EMAIL_ID")
	String emailId;

	@Column(name = "AMOUNT")
	long amount;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "order_id")
	@BatchSize(size = 10)
	private List<OrderDetails> orderDetails;

	public Order() {
		super();
	}

	public Order(long orderId, String emailId) {
		super();
		this.orderId = orderId;
		this.emailId = emailId;
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", emailId=" + emailId + ", amount=" + amount + ", orderDetails="
				+ orderDetails + "]";
	}

}
