package com.ordermanagement.app.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ordermanagement.app.exception.ResourceNotFoundException;
import com.ordermanagement.app.model.Item;
import com.ordermanagement.app.repository.ItemRepository;
import com.ordermanagement.app.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	ItemRepository itemRepository;

	@Override
	public List<Item> getAllItems() {
		return itemRepository.findAll();
	}

	@Override
	@Transactional
	public String saveItem(Item item) {
		itemRepository.save(item);
		return "SUCCESS: Item saved successfully.";
	}

	@Override
	public Item getItemById(Long id) {
		return itemRepository.findById(id).orElseThrow(ResourceNotFoundException::new);
	}

	@Override
	public String updateItem(Item item) {
		itemRepository.save(item);
		return "SUCCESS: Item updated successfully.";
	}

	@Override
	public String deleteItemById(Long id) {
		itemRepository.deleteById(id);
		return "SUCCESS: Item deleted successfully.";
	}

}
