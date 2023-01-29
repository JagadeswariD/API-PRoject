package com.array.example;

public class MethodExample1 {
	int addNumbers(int a, int b) {
		return a+b;
	}
public static void main(String[] args) {
        
        int num1 = 25;
        int num2 = 15;

        // create an object of type MethodExample1
        MethodExample1 obj = new MethodExample1();
        // call your  method
        int result = obj.addNumbers(num1,num2);
        System.out.println("Sum is: " + result);
      }
}
