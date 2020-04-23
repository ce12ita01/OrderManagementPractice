package com.ordermanagement.app.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ordermanagement.app.exception.ResourceNotFoundException;
import com.ordermanagement.app.model.Order;
import com.ordermanagement.app.repository.OrderRepository;
import com.ordermanagement.app.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderRepository orderRepository;

	@Override
	public List<Order> getAllOrders() {
		return orderRepository.findAll();
	}

	@Override
	@Transactional
	public String saveOrder(Order order) {
		orderRepository.save(order);
		return "SUCCESS: Item saved successfully.";
	}

	@Override
	public Order getOrderById(Long id) {
		return orderRepository.findById(id).orElseThrow(ResourceNotFoundException::new);
	}

	@Override
	public String updateOrder(Order order) {
		orderRepository.save(order);
		return "SUCCESS: Item updated successfully.";
	}

	@Override
	public String deleteOrderById(Long id) {
		orderRepository.deleteById(id);
		return "SUCCESS: Item deleted successfully.";
	}

}
