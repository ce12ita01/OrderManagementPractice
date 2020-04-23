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

import com.ordermanagement.app.model.Item;
import com.ordermanagement.app.service.ItemService;

@RestController
@RequestMapping(ItemController.API_ITEM_VERSION)
public class ItemController {

	@Autowired
	ItemService itemService;

	public static final String API_ITEM_VERSION = "/api/v1/item";

	@GetMapping
	public ResponseEntity<List<Item>> getAllItems() {
		return ResponseEntity.ok(itemService.getAllItems());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Item> findOne(@PathVariable Long id) {
		return ResponseEntity.ok(itemService.getItemById(id));
	}

	@PostMapping
	public ResponseEntity<String> saveItem(@RequestBody Item item) {
		return ResponseEntity.ok(itemService.saveItem(item));
	}

	@PutMapping
	public ResponseEntity<String> UpdateItem(@RequestBody Item item) {
		return ResponseEntity.ok(itemService.updateItem(item));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteItem(@PathVariable Long id) {
		return ResponseEntity.ok(itemService.deleteItemById(id));
	}
}
