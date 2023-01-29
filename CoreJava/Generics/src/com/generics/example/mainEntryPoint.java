package com.generics.example;
import java.lang.reflect.Method;
import java.util.Arrays;

class Printer
{

	public <T> void printArray(T[] intArray) {
		// TODO Auto-generated method stub
				
		for(T item:intArray)
		System.out.println(item);
	}
	
}
public class mainEntryPoint {
	public static void main( String args[] ) {
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;
        
        // https://www.geeksforgeeks.org/class-getdeclaredmethods-method-in-java-with-examples/

        // The getDeclaredMethods() method of java.lang.Class class 
        // is used to get the methods of this class, which are the
        // methods that are private, public, protected or default 
        // and its members or the members of its member classes and 
        // interfaces, but not the inherited methods. The method returns 
        // the methods of this class in the form of an array of Method objects. 
        
        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if(name.equals("printArray"))
                count++;
            System.out.println("Method count="+count);
        }

        if(count > 1)System.out.println("Method overloading is not allowed!");
        
      
    }
}
