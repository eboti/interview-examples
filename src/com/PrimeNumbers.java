package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class PrimeNumbers {
	
	public static final int MAX = 11;
	public int count = 2;

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i < MAX; i++){
			list.add(i);
		}
		new PrimeNumbers().sieve(list );
	}
	
	public List<Integer> sieve(List<Integer> list){
		
		List<Integer> temp = new ArrayList<Integer>();
		Integer number = null;
		ListIterator<Integer> it = list.listIterator();
		while (it.hasNext()){
			number = it.next();			
			if (number % list.get(count-1) == 0 ){
				temp.add(number);
			}			
		}
		
		if (temp.size() == 1){
			return list;
		}else{
			list.removeAll(temp.subList(1, temp.size()-1));
			count++;
			System.out.println(list);		
			return sieve(list);
		}		
	}
}
