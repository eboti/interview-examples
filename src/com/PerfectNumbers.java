package com;

import java.util.ArrayList;
import java.util.List;

public class PerfectNumbers {

	public static long start = 0;
	
	public static int MAX = 33550336;
							  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.out.println(isPerfect(6));
//		System.out.println(isPerfect(7));
//		System.out.println(isPerfect(28));
//		System.out.println(isPerfect(496));
//		System.out.println(isPerfect(8128));	

		start = System.currentTimeMillis();
		for (int i = 1; i <= MAX; i++ ){
			isPerfect(i);
		}
		
	}

	public static boolean isPerfect(int n){
		
		List<Integer> divisors = new ArrayList<Integer>();
		
		for (int i = 1; i <= n/2; i++){
			if (n % i == 0){
				divisors.add(i);
			}
		}
		
//		System.out.println(divisors);
		int sumOfDivisors = 0;
		for (int divisor : divisors){
			sumOfDivisors += divisor;
		}
		
		if (n == sumOfDivisors){
			System.out.println(n + " : " + (System.currentTimeMillis() - start)/1000 + " sec");
			return true;
		}else{
			return false;
		}
	}
}
