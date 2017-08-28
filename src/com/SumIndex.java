package com;

import java.io.ObjectInputStream.GetField;
import java.util.Arrays;
import java.util.List;

public class SumIndex {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 6);
		System.out.println(getIndex(list));
		
//		list = Arrays.asList(1, 2, 3, 4, 6, 45, 100, 9);
//		System.out.println(getIndex(list));
		
		int[] num = { 1, 2, 3, 4, 6 };
		try {
			System.out.println(findMiddleIndex(num));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	public static Integer getIndex(List<Integer> list){
	
		Integer index = null;
		for (int i = 1; i < list.size()-1; i++){
			// bottom list == upper list
			Integer bottomListSum = getSublistSum(list.subList(0, i));
			Integer upperListSum = getSublistSum(list.subList(i+1, list.size()));
			System.out.println(bottomListSum + " ?= " + upperListSum);
			if (bottomListSum == upperListSum){
				index = i;
				break;
			}
			
		}
		
		return index;
	}


	private static Integer getSublistSum(List<Integer> subList) {
		Integer sum = 0;
		for (Integer elem : subList){
			sum += elem;
		}
		
		return sum;
	}
	
	
	// other solution
    public static int findMiddleIndex(int[] numbers) throws Exception {
    	 
        int endIndex = numbers.length - 1;
        int startIndex = 0;
        int sumLeft = 0;
        int sumRight = 0;
        while (true) {
            if (sumLeft > sumRight) {
                sumRight += numbers[endIndex--];
            } else {
                sumLeft += numbers[startIndex++];
            }
            if (startIndex > endIndex) {
                if (sumLeft == sumRight) {
                    break;
                } else {
                    throw new Exception(
                            "Please pass proper array to match the requirement");
                }
            }
        }
        return endIndex;
    }
}
