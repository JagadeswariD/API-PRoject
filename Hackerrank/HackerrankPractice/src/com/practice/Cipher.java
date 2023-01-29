package com.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Cipher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,Integer> cipher = new HashMap<>();
		cipher.put("A",0);
		cipher.put("B",1);
		cipher.put("C",2);
		cipher.put("D",3);
		cipher.put("E",4);
		cipher.put("F",5);
		cipher.put("G",6);
		cipher.put("H",7);
		cipher.put("I",8);
		cipher.put("J",9);
		cipher.put("K",10);
		cipher.put("L",11);
		cipher.put("M",12);
		cipher.put("N",13);
		cipher.put("O",14);
		cipher.put("P",15);
		cipher.put("Q",16);
		cipher.put("R",17);
		cipher.put("S",18);
		cipher.put("T",19);
		cipher.put("U",20);
		cipher.put("V",21);
		cipher.put("W",22);
		cipher.put("X",23);
		cipher.put("Y",24);
		cipher.put("Z", 25);
		Set<Map.Entry<String, Integer>> entrySet=cipher.entrySet();
		List<Map.Entry<String,Integer>> entryList=new ArrayList<>(entrySet);
		String encrypted="VTAOG";
		int k=2;
		char[] c1= encrypted.toCharArray();
		String result="";
		for(char c:c1)
		{
			String s= String.valueOf(c);
			int index=cipher.get(s);
			int newIndex=index-k;
			if(newIndex<0) {
				newIndex+=26;}
				result=result+entryList.get(newIndex).getKey();
			
			
		}
		
		System.out.println(result);
		
	}

}
