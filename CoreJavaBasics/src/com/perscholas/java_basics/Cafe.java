package com.perscholas.java_basics;

public class Cafe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double coffee, cappuccino,greentea;
		coffee=5.24;
		cappuccino=6.14;
		greentea=7.67;
		double subTotal, totalSale;
		final double SALES_TAX=1.25;
		subTotal=0;
		double order=0;
		order= 3*coffee;
		System.out.println("coffee order:$"+order);
		subTotal=order+subTotal;
		order=4*cappuccino;
		System.out.println("Cappuccino order:$"+order);
		subTotal=order+subTotal;
		order=2*greentea;
		System.out.println("GreenTea order:$"+order);
		totalSale=subTotal+SALES_TAX;
		System.out.printf("Total Sale:$%.2f",totalSale);
		
		
	}

}
