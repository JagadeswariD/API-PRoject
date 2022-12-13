package com.string.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CompareToExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="hello";
		String s2="hello";
		String s3="hemlo";
		String s4="flag";
		System.out.println(s1.compareTo(s2)); // 0 because both are equal
		System.out.println(s1.compareTo(s3)); //-1 because "l" is only one time lower than "m"	7
		System.out.println(s1.compareTo(s4)); // 2 because "h" is 2 times greater than "f"
		String str1 = "java is fun";
		// extract substring from index 0 to 3
		System.out.println(str1.substring(0, 4));

		 Scanner myObj = new Scanner(System.in); 
		 int a,b,c;
		
			 try
			 {
				 a= Integer.parseInt(myObj.nextLine());
				 b= Integer.parseInt(myObj.nextLine());
				 c=a/b;
				 int z=6;
			 }
			 catch(InputMismatchException e1)
			 {
				 System.out.println(e1);
			 }
			 catch (ArithmeticException e2)
			 {
				 System.out.println(e2.getClass());
			 }
			 catch (NumberFormatException e3)
			 {
				 
			 }
			
	}
	
	long power(int n,int p) throws Exception{
        long result;
        
        if(n==0 || p==0)
        {
             throw new Exception("n and p should not be zero.");
        }
        else if (n<0||p<0)
        {
            throw new Exception("n and p should not be zero.");
        }
        else{
            return (long) Math.pow(n, p);
        }
        
    }
    

}
