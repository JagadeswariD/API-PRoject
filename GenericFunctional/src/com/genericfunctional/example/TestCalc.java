package com.genericfunctional.example;

public interface TestCalc {

	int sum(int a, int b);
	
	default int multiply(int a, int b) {
		return a*b;
	}
	static int div(int a, int b) {
		return a/b;
	}
}
