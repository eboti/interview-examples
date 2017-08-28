package com;

public class SumOfEachDigit {

	public static int sum = 0;
	
	public static void main(String[] args) {
		
		int number = 1352;
		
		System.out.println(getSum(number));

	}

	private static Integer getSum(int number) {
		
		sum += number % 10;
		int whole = number/10;
		if (whole == 0){
			return sum;
		}else{
			return getSum(whole);
		}
	}

}
