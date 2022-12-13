package org.example;

import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.function.Function;

public class ArrCoppier<T> {
    public ArrCoppier() {

    }

    public int[] copy(int[] arr, int newElems) {
        int len = arr.length + newElems;
        int[] newArr = new int[len];

        System.arraycopy(arr, 0, newArr, 0, len);

        return newArr;
    }

    public double[] copy(double[] arr, int newElems) {
        int len = arr.length + newElems;
        double[] newArr = new double[len];

        System.arraycopy(arr, 0, newArr, 0, len);

        return newArr;
    }

    
	public T[] copy(T[] arr, int newElems, Callable<T[]> arrFunc, Callable<T> elemFunc) throws Exception {
		int len = arr.length + newElems;
        var newArr = arrFunc.call(); //can throw

        if (len >= 0) {
            System.arraycopy(arr, 0, newArr, 0, arr.length);
        }

        for (int i = arr.length; i < len; i++) {
            newArr[i] = elemFunc.call();
        }

        return newArr;
		
    }
}