package com.sqlhackathon.doaInterface;

import java.util.List;

import com.sqlhackathon.model.Item;

public interface ItemDAO {
	// Returns a list of all item objects in the database.
	List<Item> getAllItems();

	// Adds an item with given information.
	boolean addItem(Item i);

	// Removes an item with the given id.
	boolean removeItemById(int id);
	
	//Update an item for the given id
	public boolean updateItem(Item item, int id);
}
