package com.exception.example;

public class NullPtrExcept2 {
	  public static void main (String[] args)
	    {
	        // String s set an empty string and calling getLength()
	        String s = "";
	        try
	        {
	            System.out.println(getLength(s));
	        }
	        catch(IllegalArgumentException e)
	        {
	            System.out.println("IllegalArgumentException caught");
	        }

	        // String s set to a value and calling getLength()
	        s = "GeeksforGeeks";
	        try
	        {
	            System.out.println(getLength(s));
	        }
	        catch(IllegalArgumentException e)
	        {
	            System.out.println("IllegalArgumentException caught");
	        }

	        // Setting s as null and calling getLength()
	        s = null;
	        try
	        {
	            System.out.println(getLength(s));
	        }
	        catch(IllegalArgumentException e)
	        {
	            System.out.println("IllegalArgumentException caught");
	        }
	    }

	private static int getLength(String s) throws IllegalArgumentException  {
		// TODO Auto-generated method stub
		if(s.equals(null))
			throw new IllegalArgumentException();
		else
			return s.length();
	}
}
