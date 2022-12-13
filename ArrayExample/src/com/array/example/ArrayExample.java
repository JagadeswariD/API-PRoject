package com.array.example;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a =new int[5];
		int[] c= new int[8];
		for (int i=0;i<a.length;i++)
			a[i]=i+5;
		a=Arrays.copyOf(a, 8);
		System.out.println(Arrays.toString(a));
		System.arraycopy(a, 0, c, 0, 8);
		System.out.println(Arrays.toString(c));
		
		ArrayList<String> names = new ArrayList<String>();
		    names.add("Esh");
		    names.add("James");
		    names.add("Henry");
		    System.out.println(names);
		    
		    
	}

}
