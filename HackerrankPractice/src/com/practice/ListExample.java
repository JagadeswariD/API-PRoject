package com.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListExample {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int q = scan.nextInt();
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<q;i++)
		{
			list.add(scan.nextInt());
		}
		int query=scan.nextInt();
		//System.out.println("Query: "+query);
		for(int i=0;i<query;i++) {
			String op=scan.next();
			//System.out.println("Operations "+op);
			int pos=scan.nextInt();
			if(op.equals("Insert")) {
				list.add(pos, scan.nextInt());
			}
			else
			{
				if(pos<list.size())
					list.remove(pos);
			}
			
		}
		System.out.println(list.stream().map(String::valueOf)
                .collect(Collectors.joining(" ")));
	}
}
