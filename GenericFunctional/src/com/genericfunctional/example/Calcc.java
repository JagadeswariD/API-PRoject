package com.genericfunctional.example;

public class Calcc {
	TestCalc test= new TestCalc() {

		@Override
		public int sum(int a, int b) {
			// TODO Auto-generated method stub
			return a+b;
		}
		
	};
	
	void display(TestCalc test) {
		System.out.println(test.sum(10, 5));
	}
}
