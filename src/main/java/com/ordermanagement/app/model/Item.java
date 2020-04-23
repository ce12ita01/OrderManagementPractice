package com.ordermanagement.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ITEM")
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ITEM_ID")
	long itemId;

	@Column(name = "ITEM_NAME")
	String itemName;

	@Column(name = "AVAILABLE_QUANTITY")
	long availableQuantity;

	@Column(name = "UNIT_PRICE")
	double unitPrice;

	public Item(long itemId, String itemName, long availableQuantity, double unitPrice) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.availableQuantity = availableQuantity;
		this.unitPrice = unitPrice;
	}

	public Item() {
		super();
	}

	public long getItemId() {
		return itemId;
	}

	public void setItemId(long itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public long getAvailableQuantity() {
		return availableQuantity;
	}

	public void setAvailableQuantity(long availableQuantity) {
		this.availableQuantity = availableQuantity;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", availableQuantity=" + availableQuantity
				+ ", unitPrice=" + unitPrice + "]";
	}

}
