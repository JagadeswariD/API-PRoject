package com.string.example;

public class Teststringcomparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="PerScholas";
		String s2="PerScholas";
		String s3=new String("PerScholas");
		String s4="Teksystem";
		System.out.println(s1.equals(s2));//true
		System.out.println(s1.equals(s3));//true
		System.out.println(s1.equals(s4));//false
		System.out.println(s1==s2);//true (because both refer to same instance)
		System.out.println(s1==s3);//false(because s3 refers to instance created in nonpool)
	}

}
