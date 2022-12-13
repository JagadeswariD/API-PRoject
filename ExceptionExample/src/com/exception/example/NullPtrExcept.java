package com.exception.example;

public class NullPtrExcept {
	public static void main (String[] args)
    {
        // Initializing String variable with null value
        String ptr = null;
        ptr="hello";

        try
        {

            if (ptr.equals("gfg"))
                System.out.print("Same");
            else
                System.out.print("Not Same");
        }
        catch(NullPointerException e)
        {
            System.out.print("NullPointerException Caught");
        }
    }
}
