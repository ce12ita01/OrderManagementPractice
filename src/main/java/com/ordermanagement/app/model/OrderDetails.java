package com.ordermanagement.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ORDER_DETAILS")
public class OrderDetails {

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;

	@ManyToOne
	Item item;

	@Column(name = "QUANTITY")
	int quantity;

	@Column(name = "SUBTOTAL")
	double subTotal;

	public OrderDetails() {
		super();
	}

	public OrderDetails(int id, Item item, int quantity, double subTotal) {
		super();
		this.id = id;
		this.item = item;
		this.quantity = quantity;
		this.subTotal = subTotal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}

	@Override
	public String toString() {
		return "OrderDetails [id=" + id + ", item=" + item + ", quantity=" + quantity + ", subTotal=" + subTotal + "]";
	}

}
