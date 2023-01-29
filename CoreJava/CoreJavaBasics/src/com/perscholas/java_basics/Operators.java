package com.perscholas.java_basics;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y;
		x=5;
		y=8;
		
		//postfix increment operator
		System.out.println("Before postfix:"+x);
		x++;
		System.out.println("After postfix:"+x);
		
		System.out.println("Before Prefix increment:"+x++);
		System.out.println("After prefix increment:"+x);
		System.out.println("X+1:"+(x+1));
		x=5;
		int sum=++x+y;
		System.out.println("Sum:"+sum);
		sum=x++ + y;
		System.out.println("Sum:"+sum);
	}

}
