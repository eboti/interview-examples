package com;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.LongAdder;
import java.util.stream.Collectors;

public class ListSumRecursive {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 3, 55, 1);

		System.out.println(numbers.stream().collect(
				Collectors.summingInt(Integer::intValue)));

		System.out.println(numbers.stream().mapToInt(Integer::intValue).sum());
		
		System.out.println(new ListSumRecursive().sumListRecursively(numbers));
		
		LongAdder longAdder = new LongAdder();
		numbers.forEach(longAdder::add);
		System.out.println(longAdder.longValue());

	}

	public int sumListRecursively(List<Integer> numbers) {

		int sum = 0;
		if (!numbers.isEmpty()) {
			sum = numbers.get(0) + sumListRecursively(numbers.subList(1, numbers.size()));
		}

		return sum;
	}
}
