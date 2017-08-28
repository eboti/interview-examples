package com;

import java.util.ArrayList;
import java.util.List;

public class ArmstrongNumber {

	public static List<Integer> digits = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		
		int armstrongNumber = 371;
		int notArmstrongNumber = 123;
			
		
		System.out.println(isArmstrongNumber(armstrongNumber, getDigits(armstrongNumber)));
		System.out.println(isArmstrongNumber(notArmstrongNumber, getDigits(notArmstrongNumber)));
	}
	
	public static boolean isArmstrongNumber(int number, List<Integer> digits){
		int sum = 0;
		for (int digit : digits){
			sum += Math.pow(digit, digits.size());
		}
		
		if (number == sum){
			return true;
		}
		
		return false;
	}
	
	public static List<Integer> getDigits(int number){
		
		int wholePart = number/10; 
				
		digits.add(number % 10);
		if (wholePart == 0){
			return digits;
		}
		
		return getDigits(wholePart);
	}
}
