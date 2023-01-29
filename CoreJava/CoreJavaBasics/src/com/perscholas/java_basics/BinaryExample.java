package com.perscholas.java_basics;

public class BinaryExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,8,33,78,787,33987};
		for (int i : a) {
			System.out.println("Decimal No:"+i);
			decToBinary(i);
		}
		
		long[] b= {0010,1001,00110100};
		for (long l : b) {
			System.out.println("Binary value:"+l);
			convertBinaryToDecimal(l);
		}
	}

	
	static void decToBinary(int n)
    {
        int[] binaryNum = new int[1000];
        int i = 0;
        while (n > 0) 
        {
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }
        System.out.println("Binary:");
        for (int j = i - 1; j >= 0; j--)
            System.out.print(binaryNum[j]);
    }
	
	static void convertBinaryToDecimal(long num) {
	    int decimalNumber = 0, i = 0;
	    long remainder;
	    
	    while (num != 0) {
	      remainder = num % 10;
	      num /= 10;
	      decimalNumber += remainder * Math.pow(2, i);
	      ++i;
	    }
	    
	    System.out.println("Decimal Number:"+decimalNumber);
	  }
}
