package com.hackathon.lab1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringJoiner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 HashSet<Integer> primeNumbers = new HashSet<>();
	        primeNumbers.add(2);
	        primeNumbers.add(3);
	        primeNumbers.add(5);
	        System.out.println(primeNumbers.add(2));
	        System.out.println(primeNumbers);
	        
	        HashMap<String, String> capitalCities = new HashMap<String, String>();
	        capitalCities.put("England", "London");
	        capitalCities.put("Germany", "Berlin");
	        capitalCities.put("Norway", "Oslo");
	        capitalCities.put("USA", "Washington DC");
	        capitalCities.put("USA", "Washington DC");
	        System.out.println(capitalCities); 
	        
	        String e =null;
	        String e2="Hi";
	        String e3=null;
	        System.out.println((e==null ? e2==null : e.equals(e2)));
	        System.out.println(e2);
	        
	        
	}

}
