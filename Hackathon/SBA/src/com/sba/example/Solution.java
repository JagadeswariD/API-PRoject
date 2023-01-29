package com.sba.example;//// <<<<<======== Click here to expand the locked stub code
import java.util.*;

interface MyList{
 void convert(String[] a);
 void replace(int idx);	
 ArrayList<String> compact();
}
/*
This is here only for visibility. Please do not take the code below out of the comments. 
import java.util.*;

interface MyList{
 void convert(String[] a);
 void replace(int idx);    
 ArrayList<String> compact();
}

This is here only for visibility. Please do not take the code above out of the comments.
*/

// ================ PLEASE WRITE CODE HERE =============

//Write your implementation of the InvalidStringException and the ArrayToList classes below
    
class InvalidStringException extends Exception{
    
    InvalidStringException(String message){
        super(message);
    }
  
}

class ArrayToList implements MyList{
    ArrayList<String> arrayToList;
    ArrayToList(){
        arrayToList= new ArrayList<String>();
    }
    public void convert(String[] a){
      //  System.out.println(Arrays.toString(a));
        for(int i=0;i<a.length;i++){
            // System.out.println(a[i]);
               arrayToList.add(a[i]);
               System.out.printf("I have added the string: %s at the index: %d\n",a[i],i);
        }
       
    }
    public void replace(int idx){
         String temp="";
         
        temp=arrayToList.get(idx);
      //  System.out.println(idx+" "+temp);
        if(!temp.equals("")){
        arrayToList.set(idx, "");
        System.out.printf("I have replaced the string: %s with a null string\n",temp);
       }
    }
    public ArrayList<String> compact(){
        ArrayList<String> clonedList =new ArrayList<String>();
        String s="";
       int count=0;
         for (int i=0;i< arrayToList.size();i++) {
            String string = arrayToList.get(i);
             if(!string.equals("")){
              // arrayToList.remove(i);
               clonedList.add(string);
            }
        }
       // System.out.println(clonedList);
          return clonedList;
    }
    
}

    
 
    
 

// <<<<<======== Click here to expand the locked stub. Please take a look at the locked stub code to better understand how your implementation of the required classes will be validated. 
//PlEASE DO NOT ATTEMPT TO MODIFY THE CODE BELOW !!!!!!. 
public class Solution{
  
  public static void main(String[] args){
  
  Scanner sc = new Scanner(System.in);
  Random rand = new Random(0);

  int n = Integer.parseInt(sc.nextLine());
  String[] a = new String[n];

  for(int i = 0; i < n; i++)
  	a[i] = sc.nextLine();
  
  MyList obj = new ArrayToList();

  obj.convert(a);
  int x = rand.nextInt(n);
  for(int i = 0; i < x; i++)
  	obj.replace(rand.nextInt(n));


  ArrayList<String> s = obj.compact();
  


  for (int i = 0; i < s.size(); i++){
	  System.out.println(s.get(i));
  	if(s.get(i).charAt(0) >= 97 && s.get(i).charAt(0) <= 122){
  	 try{
       throw new InvalidStringException("This is an invalid string");
  	 }
  	 catch(InvalidStringException e){System.out.println(e.getMessage());}	
  	}
  }


}
}