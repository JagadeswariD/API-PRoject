package com.sqlhackathon.doaInterface;

import com.sqlhackathon.model.Customer;

public interface CustomerDAO {

	// Method to return the customer object for the given id.
	Customer getCustomerById(int id);

	// Adds a customer with given information.
	boolean addCustomer(Customer c);

	// Removes a customer with the given id.
	boolean removeCustomerById(int id);
}
