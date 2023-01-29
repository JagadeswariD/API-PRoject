package com.practice;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapExample {
	public static void main(String[] args) {
	       Scanner scan = new Scanner(System.in);
	        HashMap<String, Integer> phoneDir=new HashMap<>();
	        int q = scan.nextInt();
	        scan.nextLine();
	        for(int i=0;i<q;i++) {
	            
	            phoneDir.put(scan.nextLine(),Integer.parseInt(scan.nextLine()));
	        }
	        while(scan.hasNext())
	        {
	            String name=scan.nextLine();
	            if(phoneDir.containsKey(name))
	            System.out.println(name+"="+phoneDir.get(name));
	            else
	                System.out.println("Not found");
	        }
	    }
}
