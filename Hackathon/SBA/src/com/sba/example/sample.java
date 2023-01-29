package com.sba.example;

import java.util.ArrayList;

public class sample {
	 public static void main(String[] args){
	 
		 String s="";
		 System.out.println(s.isBlank());
		 float avg= (float)11/2;
		 System.out.println(avg);
		 int[] a=new int[11];
		 //a[11]=0;
		 System.out.println(a.length);
		 char c=122;
		 System.out.println(c);
		 ArrayList<String> clonedList =new ArrayList<>();
		 clonedList.add("hi");
		 clonedList.add(" ");
		 clonedList.add("hello");
		 clonedList.add(" ");
		 System.out.println(clonedList);
		 
		 System.out.println(clonedList);
		 String str="mt, 84271, sazpu, 51883, 922, 4, 01, 8, kzo, 6, uojv, vfb, 7213, usi, 6959, 96, 0, xib, 7817, yicih, 02, 091, ojkj, l, f, zpxo, nwf, ah, aivo, 732, ip, 2666, 3, mnd, 4953, 66, 63355, 475, 86669, 0785, 25183, 3340, 46, 4922, 3108";
		 String[] s1= str.split(", ");
		 System.out.println(s1.length);
		 for(String st:s1)
		 {
			 System.out.println(st);
		 }
	 }
}
