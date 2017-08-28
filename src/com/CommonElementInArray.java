package com;

public class CommonElementInArray {

	public static void main(String[] args) {
		
		int[] array = {1, 2, 3, 7, 9};
		int[] anotherArray = {2, 3, 8};
		
		int[] commonElements = {};
		if (array.length < anotherArray.length){
			commonElements = getCommonElement(array, anotherArray);
		}else{
			commonElements = getCommonElement(anotherArray, array);
		}
		
		for (int number : commonElements){
			System.out.println(number);	
		}	
	}
	
	
	public static int[] getCommonElement(int[] smallerArray, int[] largerArray){
		
		int[] commonElements = new int[smallerArray.length];
		int index = 0;
		for (int number : smallerArray){
			for (int onotherNumber : largerArray){
				if (number == onotherNumber){
					commonElements[index++] = number;
					break;
				}
			}
		}
		
		return commonElements;
	}
}
