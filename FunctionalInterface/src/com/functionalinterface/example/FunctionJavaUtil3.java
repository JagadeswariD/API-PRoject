package com.functionalinterface.example;
import java.util.function.Function;
public class FunctionJavaUtil3 {
	 public static void main(String args[])
	    {
	        // Function which takes in a number and
	        // returns half of it
	        Function<Integer, Double> half = a -> a / 2.0;

	        // INSERT CODE TO TRIPLE THE VALUE OF THE HALF FUNCTION 
	        half = half.andThen(a -> 3 * a);

	        // Applying the function to get the result
	        System.out.println(half.apply(5));
	    }
}
