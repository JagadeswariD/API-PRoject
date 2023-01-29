package com.perscholas.java_basics;

public class Division {

	public static void main(String[] args) {
		// Dividing two integers
		int x=12, y=4;
		int div=x/y;
		System.out.println("Dividing Integer:"+div);
		// dividing double by int
		double z=12.2;
		div=(int) (z/y);
		System.out.println("Dividing Double by int:"+div);
		//Dividing two double
		double a=15.1,b=3.0;
		double result=a/b;
		System.out.println("Dividing double by double:"+ result);
		int res=(int)result;
		System.out.println("Typecasting Double to int:"+ res);
		
		int x1=5,y1=6;
		int q=x1/y1;
		System.out.println("Q value:"+q);
		double z1=y1;
		q=(int) z1;
		System.out.println("Q value:"+q);
		//Named constant example
		final double PI=3.143;
		System.out.println("Area of a circle:"+2*2*PI);
		
		
	}

}
