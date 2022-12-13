package com.string.example;

import java.util.Arrays;

public class SplitMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String vowels = "a::b::c::d:e";
		// splitting the string at "::"
		// storing the result in an array of strings
		String[] result = vowels.split("::",2);
		// converting array to string and printing it
		System.out.println("result = " + Arrays.toString(result));
		String message = "Welcome to Java";
		System.out.println("The first character in the message is " +
		message.charAt(0));


	}

}
