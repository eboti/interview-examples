package com;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.println(fibonacci(10));

	}

	public static List<Integer> fibonacci(int n){
		
		int a1 = 1;
		int a2 = 1;
		
		List<Integer> fibonacci = new ArrayList<Integer>();
		fibonacci.add(a1);
		fibonacci.add(a2);
		
		for (int i = 2; i < n; i++){
			fibonacci.add(fibonacci.get(i-2) + fibonacci.get(i-1));
		}
				
		return fibonacci;
	}
}
