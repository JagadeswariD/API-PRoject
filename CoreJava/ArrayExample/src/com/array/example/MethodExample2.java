package com.array.example;

public class MethodExample2 {


	static int squareNumber(int num) {
		return num*num;
	}

	 

    public static void main(String[] args) {
      int result;

      int inputValue=10;

      // call the method
      // store returned value to result
      result = squareNumber(inputValue);

      System.out.println("Squared value  is: " + result);
    }

}
