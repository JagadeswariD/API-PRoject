package com.practice;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Sample {
	 public int[] twoSum(int[] nums, int target) {
	        int pointer=0;
	        for(int i=1;i<nums.length;i++)
	        {
	            if(nums[pointer]+nums[i] == target)
	            {
	                 return new int[] {pointer,i};
	            }
	        }
			return null;
	    }
	 
	 static int maxSum(int arr[], int n)
	    {
	        if (n < 2)
	            return -1;
	        int ans = arr[0] + arr[1];
	        for (int i = 1; i + 1 < n; i++)
	            ans = Math.min(ans, (arr[i]
	                           + arr[i + 1]));
	        return ans;
	    }
	 
	  public boolean containsDuplicate(int[] nums) {
	     Arrays.sort(nums);   
	     for(int i=0;i<nums.length-1;i++) {
	    	 if(nums[i]==nums[i+1]) {
	    		 return true;
	    	 }
	     }
	     return false;
	    }
	  
	  public static int singleNumber(int[] nums) {
	        Arrays.sort(nums);
	        int count=0;
	        for(int i=0;i<nums.length-1;i++) {
		    	 if(nums[i]!=nums[i+1]) {
		    		count=nums[i+1];
		    	 }
		     }
	        return count;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {4,1,2,1,2};
		System.out.println(singleNumber(a));
		Set<Integer> set = IntStream.of(a).boxed().collect(Collectors.toSet());
		set.size();
		
		String s1="aWyFOuAWguGBKPUHoDu";
		String s2="nQZAbFSnPudOhyWuXFVsvU";
		List <String> ls = new ArrayList<>();
		
		ls.add(s1);
		ls.add(s2);
		Collections.sort(ls);
		System.out.println(ls);
		System.out.println(s1.compareTo(s2));
		
		String v1="apple 1 1.2";
		String v2="banana 1 4.5";
		String v3="orange 1 1.2";
		String v4="banana 1 4.5";
		String v5="pineapple 1 1.2";
		
		Set<String> setV=new HashSet<>();
		setV.add(v1);
		setV.add(v2);
		setV.add(v3);
		setV.add(v4);
		setV.add(v5);
		System.out.println("Size: "+setV.size());
		
		List<Integer> l1= new ArrayList<>();
		l1.add(1);l1.add(4);
		l1.add(8);l1.add(9);		
		l1.add(10);l1.add(11);
		l1.add(7);l1.add(15);
		
		List<Integer> l2= new ArrayList<>();
		l2.add(12);l2.add(14);
		l2.add(28);l2.add(49);		
		l2.add(10);l2.add(31);
		l2.add(72);l2.add(35);
		
		
		List<Integer> newList= new ArrayList<>();
		newList.addAll(l1);
		newList.addAll(l2);
		Collections.sort(newList);
		System.out.println(newList.toString());
		
		int arr[] = {1, 12, 2, 2};
        int n = arr.length;
         
        System.out.println( maxSum(arr, n));

	}

}
