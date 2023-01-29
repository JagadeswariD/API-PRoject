package com.sqlhackathon;

import java.sql.SQLException;

import com.sqlhackathon.doaImplementation.CustomerDAOImpl;
import com.sqlhackathon.doaImplementation.ItemDAOImpl;
import com.sqlhackathon.doaInterface.CustomerDAO;
import com.sqlhackathon.doaInterface.ItemDAO;
import com.sqlhackathon.model.Customer;
import com.sqlhackathon.model.Item;

public class MainClass {

	public static void main(String[] args) {
		// Creating CustomerDao
		CustomerDAO customerDao = new CustomerDAOImpl();

		// Creating ItemDao
		ItemDAO itemDao = new ItemDAOImpl();

		System.out.println("--------- Inserting customer records ----------");

		Customer customer1 = new Customer();
		customer1.setFname("Benjamin");
		customer1.setLname("Franklin");
		customer1.setEmail("benjaminfranklin@gmail.com");
		customerDao.addCustomer(customer1);

		Customer customer2 = new Customer();
		customer2.setFname("Thomas");
		customer2.setLname("Edison");
		customer2.setEmail("thomasedison@gmail.com");
		customerDao.addCustomer(customer2);

		Customer customer3 = new Customer();
		customer3.setFname("James");
		customer3.setLname("Watt");
		customer3.setEmail("jameswatt@gmail.com");
		customerDao.addCustomer(customer3);

		Customer customer4 = new Customer();
		customer4.setFname("JamesTemp");
		customer4.setLname("WattTemp");
		customer4.setEmail("jameswatttemp@gmail.com");
		customerDao.addCustomer(customer3);
		System.out.println("======================");

		System.out.println(" ====== Retrieve customer by id ====");
		Customer c = new Customer();
		c = customerDao.getCustomerById(2);
		System.out.println("======================");
		System.out.println(
				"Customer First Name :" + c.getFname() + " Last Name: " + c.getLname() + " Email: " + c.getEmail());

		System.out.println(" ====== Delete customer by id ====");
		if (customerDao.removeCustomerById(4)) {
			System.out.println("Record is deleted");
		} else {
			System.out.println("Record is not deleted");
		}
		System.out.println("======================");

		System.out.println("--------- Inserting item records ----------");

		Item item1 = new Item();
		item1.setName("Apples");
		item1.setPrice(4.25);
		itemDao.addItem(item1);

		Item item2 = new Item();
		item2.setName("Orange");
		item2.setPrice(5.30);
		itemDao.addItem(item2);

		Item item3 = new Item();
		item3.setName("Grapes");
		item3.setPrice(3.85);
		itemDao.addItem(item3);

		Item item4 = new Item();
		item4.setName("Strawberry");
		item4.setPrice(4.55);
		itemDao.addItem(item4);

		System.out.println("======================");

		System.out.println(" ====== Display list of items ====");

		for (Item i : itemDao.getAllItems()) {
			System.out.println("Item Name :" + i.getName() + "Item Price: " + i.getPrice());

		}

		System.out.println("======================");

		System.out.println(" ====== Delete item by id ====");
		
		if (itemDao.removeItemById(4)) {
			System.out.println("Item is deleted");
		} else {
			System.out.println("Item is not deleted");
		}
		
		System.out.println("======================");
		
		System.out.println(" ====== Updating item information====");
		
		item2.setName("Orange");
		item2.setPrice(5.30);
		if(itemDao.updateItem(item2, 2)) {
			System.out.println("Item updated successfuly");
		}
		else {
			System.out.println("Item not found");
		}

	}

}
