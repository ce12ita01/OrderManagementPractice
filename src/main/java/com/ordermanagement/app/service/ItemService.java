package com.ordermanagement.app.service;

import java.util.List;

import com.ordermanagement.app.model.Item;

public interface ItemService {

	public List<Item> getAllItems();

	public String saveItem(Item item);

	public Item getItemById(Long id);

	public String updateItem(Item item);

	public String deleteItemById(Long id);

}
