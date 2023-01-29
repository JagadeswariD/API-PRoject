package com.exception.example;

public class ThrowableExample {
	 public static void main(String[] args)
		        throws Exception
		    {

		        try {

		            testException();
		        }

		        catch (Throwable e) {

		            // Print using tostring()
		            System.out.println("Exception: "
		                            + e.toString());
		        }
		    }

		    // Method which throws Exception
		    public static void testException()
		        throws Exception
		    {

		    	int a,b,c;
		    	a=3;
		    	b=0;
		    	c=a/b;
		    			System.out.println(c);
		    	
		        // WHAT YOU NEED to do:  code this method
		    }
}
