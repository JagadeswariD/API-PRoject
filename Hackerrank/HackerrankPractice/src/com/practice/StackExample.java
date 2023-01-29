package com.practice;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
	       Scanner scan = new Scanner(System.in);
	       Stack<String> stack = new Stack<>();
	       
	     //  int n=scan.nextInt();
	       boolean flag=false;
	      while(scan.hasNext()) {
	    	  
	    	   String[] line= scan.nextLine().split("");
	    	 
	    	   for(String s: line) {
	    		    if(s.equals("(")||s.equals("{")||s.equals("["))
	    		   {
	    			   stack.push(s);
	    		   }
	    		   else if(s.equals(")"))
	    		   {
	    			   if( !stack.empty()&& stack.pop().equals("("))
	    			   flag=true;
	    		   }
	    		   else if(s.equals("}"))
	    		   {
	    			   if( !stack.empty() && stack.pop().equals("{"))
	    			   flag=true;
	    		   }
	    		   else if(s.equals("]"))
	    		   {
	    			   if( !stack.empty() && stack.pop().equals("["))
	    			   flag=true;
	    		   }
	    		   else {
	    			   flag=false;
	    		   }
	    	   }
	    	   if(flag && stack.empty()) {
	    		   System.out.println("true");
	    	   }
	    	   else
	    	   {
	    		   System.out.println("false");
	    		   stack.clear();
	    		   
	    	   }
	       }
	}
}
