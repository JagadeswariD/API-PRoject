package com.sqlhackathon.model;

public class Item {

	int id;
	String name;
	double price;

	public Item(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public Item( String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public Item() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double d) {
		this.price = d;
	}

	

}
