package com;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateNumber1ToN {

	// http://java2novice.com/java-interview-programs/
	public static void main(String[] args) {
		
		List<Integer> originalList = Arrays.asList(1, 2, 3, 4, 11, 11, 30, 30);
		
		System.out.println(getDuplicateNumbers(originalList));	
		System.out.println(findDuplicateNumber(originalList));
	}

	
	public static Set<Integer> getDuplicateNumbers(List<Integer> originalList){
		Set<Integer> duplicateNumbers = new HashSet<Integer>();
		Set<Integer> allNumbers = new HashSet<Integer>();
		
		for (Integer elem : originalList){
			if (!allNumbers.add(elem)){
				duplicateNumbers.add(elem);
			}
		}
		
		return duplicateNumbers;
	}
	
	// another solution, only for without gaps
    public static int findDuplicateNumber(List<Integer> numbers){
        int highestNumber = numbers.size() - 1;
        int total = getSum(numbers);
        int duplicate = total - (highestNumber*(highestNumber+1)/2);
        return duplicate;
    }
     
    public static int getSum(List<Integer> numbers){
         
        int sum = 0;
        for(int num:numbers){
            sum += num;
        }
        return sum;
    }

}
