package com.hackathon.lab1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class MiniHackathon {
	LinkedList<Customer> customerList = new LinkedList<Customer>();

	public static void main(String[] args) {
		MiniHackathon m = new MiniHackathon();
		m.loadVendorData();
	}

	// this is what the vendor (Crufty-Clunky code Inc) has provided
	// loadVendorData() method as a starting point.
	//
	// here are the fields required for a Customer Object:
	//
	// "first_name",
	// "last_name",
	// "company_name",
	// "address",
	// "city",
	// "county",
	// "state",
	// "zip",
	// "phone1",
	// "phone2",
	// "email",
	// "web"
	//
	// Our requirements are:
	// Create Customer objects, populate them and utilize one of the
	// Java collection class data structures ( ArrayList or LinkedList for example)
	// to
	// hold the Customer objects then
	//
	// provide a simple lookup (use Scanner obj) as stated in this part of the BRD,
	// that will take a Last_name as input.
	//
	// Place Order (Customer)
	// 2.The system displays the customer's information: name, street, city, zip,
	// phone, email.
	// given input will be last_name.
	void loadVendorData() {
		// please map this file to your drive
		String lastName = null;
		String file = "C:\\Users\\djesw\\OneDrive\\Desktop\\PerScholas\\New folder\\us-500.csv";
		String line;
		try (BufferedReader br = new BufferedReader(new FileReader(file)))
		{
			line=br.readLine();
			while ((line = br.readLine()) != null) {
					customerList.add(setVariable(line));

				}

			displayCustomer();
			System.out.println("\n\n##############################CUSTOMER DETAILS LOADED SUCCESSFULLY##############################\n\n");
			
			do{
				System.out.println("Type DONE to break the loop ");
				System.out.println("Enter Customer LastName to lookup for details:");
				Scanner scan = new Scanner(System.in);
				lastName = scan.nextLine();
				if(!lastName.equalsIgnoreCase("DONE"))
					productOrder(lastName);
			}while(!lastName.equalsIgnoreCase("DONE"));

		

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	Customer setVariable(String line) {
		//line = line.replace("\"", "");
		String[] temp = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
		line=String.join("<>", temp).replace("\"", "");
		//System.out.println(line);
		String[] fields = line.split("<>");
		Customer customer = new Customer();
		customer.setFirst_name(fields[0]);
		customer.setLast_name(fields[1]);
		customer.setCompany_name(fields[2]);
		customer.setAddress(fields[3]);
		customer.setCity(fields[4]);
		customer.setCounty(fields[5]);
		customer.setState(fields[6]);
		customer.setZip(fields[7]);
		customer.setPhone1(fields[8]);
		customer.setPhone2(fields[9]);
		customer.setEmail(fields[10]);
		customer.setWeb(fields[11]);

		return customer;
	}

	 

	void printCustomer(Customer customer) {
		System.out.println("\n");
		System.out.println("##########################CUSTOMER DETAILS##########################\n");
		System.out.println("Customer FirstName   : \t" + customer.getFirst_name());
		System.out.println("Customer LastName    : \t" + customer.getLast_name());
		System.out.println("Customer Company Name: \t" + customer.getCompany_name());
		System.out.println("Customer Address     : \t" + customer.getAddress());
		System.out.println("Customer City        : \t" + customer.getCity());
		System.out.println("Customer County      : \t" + customer.getCounty());
		System.out.println("Customer State       : \t" + customer.getState());
		System.out.println("Customer Zip         : \t" + customer.getZip());
		System.out.println("Customer Phone1      : \t" + customer.getPhone1());
		System.out.println("Customer Phone2      : \t" + customer.getPhone2());
		System.out.println("Customer Email       : \t" + customer.getEmail());
		System.out.println("Customer Web         : \t" + customer.getWeb());
		System.out.println("\n\n");
	}

	void productOrder(String customer_lastname) {
		boolean flag = true;
		for (Customer cust : customerList) {

			if (cust.getLast_name().equalsIgnoreCase(customer_lastname)) {

				printCustomer(cust);
					flag = false;
			}
		}
		if (flag) {
			System.out.println("\n");
			System.out.println("CUSTOMER NOT FOUND");
			System.out.println("\n\n");
		}
	}
	
	
	void displayCustomer() {
		Iterator<Customer> it= customerList.iterator();
		System.out.printf("|%-30s | %-30s |%-30s | %-30s |%-30s | %-30s |%-30s | %-30s |%-30s | %-30s |%-30s |%n",
							"First Name", "Last Name",
							"Company Name","Address",
							"City","County",
							"State","Zip",
							"Phone No1","Phone No2",
							"Email","Web");

		while(it.hasNext())
		{
			Customer cust=it.next();
		    System.out.printf("|%-30s | %-30s |%-30s | %-30s |%-30s | %-30s |%-30s | %-30s |%-30s | %-30s |%-30s ||%n", cust.getFirst_name(),
		    		cust.getLast_name(),
		    		cust.getCompany_name(),
		    		cust.getAddress(),
		    		cust.getCity(),
		    		cust.getCounty(),
		    		cust.getState(),
		    		cust.getZip(),
		    		cust.getPhone1(),
		    		cust.getPhone2(),
		    		cust.getEmail(),
		    		cust.getWeb());

		}
	}
}
