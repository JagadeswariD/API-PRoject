package com.practice;

public class longestSubstring {
public static void main(String args[]) {
	String s="";
	 char[] c1=s.toCharArray();
     int length=0;
     String temp="";
     String result="";
     int maxLength=0;
     boolean flag=false;
     for(int i=0;i<c1.length()-1;i++){
         for(int j=i;j<c1.length()-1;j++){
             if(c1[j]!=c1[j+1])
             {
                 temp+=c1[j];
             }
             else
                 break;
         }
         if(temp.l>result.length)
         {
             result=temp;
             temp="";
         }
         }
        sys
     }
}
}
