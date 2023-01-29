package com.practice;

import java.util.*;

public class dequeueExample {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Deque deque = new ArrayDeque<>();
		int n = in.nextInt();
		int m = in.nextInt();
		int j=0;
		for (int i = 0; i < n; i++) {
			if(j<3) {
				int num = in.nextInt();
				if (deque.contains(num)) {
					deque.removeFirstOccurrence(num);
				}
				else
				{
					deque.add(num);
				}
				j++;
				if(j==3) {
					System.out.println(deque.toString());
					j=0;
					deque.clear();
				}
			}
		}
	}
}