package com.generics.example;

public class GenericClassLAB1 {
	public static void main(String[] args) {

        // initialize generic class
        // with Integer data
        GenericsClass<Integer> intObj = new GenericsClass<>(5);
        System.out.println("Generic Class returns: " + intObj.getData());

        // initialize generic class
        // with String data
        GenericsClass<String> stringObj = new GenericsClass<>("Java Programming");
        System.out.println("Generic Class returns: " + stringObj.getData());
        
        // initialize generic class  ENTER CODE HERE!
        // with Boolean data

      }
    }