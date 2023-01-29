package com.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
           int total_lines = sc.nextInt();
           ArrayList< ArrayList<Integer>> totalList= new ArrayList< ArrayList<Integer>>();
           for(int i=0;i<total_lines;i++){
               int sublist_length=sc.nextInt();
               totalList.add(new ArrayList<>());
               for(int k=0;k<sublist_length;k++) {
            	   totalList.get(i).add(k, sc.nextInt());
               }
           }
           
           int query_lines=sc.nextInt();
           for (int i=0;i<query_lines;i++) {
        	   System.out.println(i);
        	   int fpointer = sc.nextInt();
        	   int spointer = sc.nextInt();
        	  // System.out.println(totalList.get(fpointer-1));
        	   if(spointer<=totalList.get(fpointer-1).size()) {
        	   System.out.println(totalList.get(fpointer-1).get(spointer-1));}
        	   else {
        		   System.out.println("ERROR!");}
           }
   }
}
