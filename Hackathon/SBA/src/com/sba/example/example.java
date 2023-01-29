package com.sba.example;

public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < s.size(); i++){
		  	if(s.get(i).charAt(0) >= 97 && s.get(i).charAt(0) <= 122){
		  	 try{
		       throw new InvalidStringException("This is an invalid string");
		  	 }
		  	 catch(InvalidStringException e){System.out.println(e.getMessage());}	
		  	}
		  }
	}

}
