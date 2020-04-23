package com.ordermanagement.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ordermanagement.app.model.Order;
import com.ordermanagement.app.service.OrderService;

@RestController
@RequestMapping(OrderController.API_ORDER_VERSION)
public class OrderController {

	@Autowired
	OrderService orderService;

	public static final String API_ORDER_VERSION = "/api/v1/order";

	@GetMapping
	public ResponseEntity<List<Order>> getAllOrders() {
		return ResponseEntity.ok(orderService.getAllOrders());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Order> findOne(@PathVariable Long id) {
		return ResponseEntity.ok(orderService.getOrderById(id));
	}

	@PostMapping
	public ResponseEntity<String> saveOrder(@RequestBody Order order) {
		return ResponseEntity.ok(orderService.saveOrder(order));
	}

	@PutMapping
	public ResponseEntity<String> UpdateItem(@RequestBody Order order) {
		return ResponseEntity.ok(orderService.updateOrder(order));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteItem(@PathVariable Long id) {
		return ResponseEntity.ok(orderService.deleteOrderById(id));
	}

}
