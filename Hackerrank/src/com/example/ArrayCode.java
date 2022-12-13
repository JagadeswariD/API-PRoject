package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class ArrayCode {

	public static void main(String[] args) {
		
		float a=1.4f;
		int e = (int) a;
		System.out.println(e);
		// TODO Auto-generated method stub
		StringJoiner joinData = new StringJoiner(",", "[", "]");
	      // ---Adding values to StringJoiner  ---
			 joinData.add("Java");  
			 joinData.add("Python");  
			 joinData.add("C Sharp");  
			 joinData.add("JavaScript");  
		     System.out.println(joinData); 
		     float b=3.45F;
		     System.out.printf("%f %n",b);
		     System.out.printf("%.2f %n",b);
		     
		     int x = 2;
		        int y = 0;
		        for (; y < 10; ++y) {
		            if (y % x == 0)
		                continue;
		            else if (y == 8)
		                break;
		            else

		                System.out.print(y + " ");
		        }
		        
		        StringJoiner sj1 = new StringJoiner(":", "{", "}");
				StringJoiner sj2 = new StringJoiner(",", "[", "]");
				sj1.add("Name").add("Tony");
				sj2.add("LastName").add("Strak");
				System.out.println(sj1.merge(sj2).toString());


}
}
