package com;

public class FindMissingNumber {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 7};
		System.out.println(findMissingNumber(numbers));
	}

	// O(n)
	public static Integer findMissingNumber(int[] numbers){
		Integer result = null;
		
		for (int i =0; i < numbers.length; i++){
			if (numbers[i+1] - numbers[i] != 1){
				return numbers[i] + 1; 
			}
		}
		
		return result;
	}
	
	public static Integer findMissingNumberBinaryApproach(int[] numbers){
		// separate 2 parts and use sum formula
		
	}
}
