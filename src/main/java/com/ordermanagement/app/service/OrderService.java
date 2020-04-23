package com.ordermanagement.app.service;

import java.util.List;

import com.ordermanagement.app.model.Order;

public interface OrderService {

	public List<Order> getAllOrders();

	String saveOrder(Order order);

	Order getOrderById(Long id);

	String updateOrder(Order order);

	String deleteOrderById(Long id);
}
