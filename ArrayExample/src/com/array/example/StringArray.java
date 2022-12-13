package com.array.example;

import java.util.Arrays;
import java.util.Scanner;

public class StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String[] a= {"zoo","dog","cat","ball","elephant","apple"};
		String[] c= {"zoo","dog","cat","ball","elephant","apple"};
		String[] d;
		d=a;
		String[] ex=new String[4];
		  int[] x = new int[5];
		    int i;
		    for (i = 0; i < x.length; i++)
		      x[i] = i;
		    System.out.println(x[i]);



		System.out.println(Arrays.equals(a, c));
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		String[] b=Arrays.copyOf(a, 8);
		System.out.println(Arrays.toString(b));
		b[2]="hello";
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(a));
		if(a==d) {
			System.out.println("Same instance");
			a[1]="bees";
		}
		else
			System.out.println("different instance");
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(d));
	
		
	}

}
