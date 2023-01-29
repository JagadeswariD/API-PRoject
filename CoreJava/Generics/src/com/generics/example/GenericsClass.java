package com.generics.example;

public class GenericsClass<T> {
	  private T data;  // class variable of T type
	   public GenericsClass(T data) { // constructor
	       this.data = data;
	   }
	   // method that return T type variable
	   public T getData() {
	       return this.data;
    }
}
