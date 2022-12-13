package com.perscholas.java_basics;

public class BinaryStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=2;
		System.out.println(Integer.toBinaryString(x));
		int y=x<<1;
		System.out.println("After left shift"+y);
		x=9;
		System.out.println(Integer.toBinaryString(x));
		y=x<<1;
		System.out.println("After left shift"+y);
		x=17;
		System.out.println(Integer.toBinaryString(x));
		y=x<<1;
		System.out.println("After left shift"+y);
		x=88;
		System.out.println(Integer.toBinaryString(x));
		y=x<<1;
		System.out.println("After left shift"+y);
		x=150;
		System.out.println(Integer.toBinaryString(x));
		y=x>>2;
		System.out.println("After right shift"+y);
		x=225;
		System.out.println(Integer.toBinaryString(x));
		y=x>>2;
		System.out.println("After right shift"+y);
		x=1555;
		System.out.println(Integer.toBinaryString(x));
		y=x>>2;
		System.out.println("After right shift"+y);
		x=32456;
		System.out.println(Integer.toBinaryString(x));
		y=x>>2;
		System.out.println("After right shift"+y);
		
	}

}
