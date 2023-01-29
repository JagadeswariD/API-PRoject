package com.array.example;

import java.util.Arrays;

public class ArrayBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String[] names = {"Carol", "Bob", "Alice", "John", "Tim", "Kate", "Mary"};
         
	        // Please implement a Binary search that will display what index
	        // Mary is at
		 System.out.println("Mary is at index: "+Arrays.binarySearch(names, "Mary"));
	}

}
