package com;

public class BubbleSort {

	public static void main(String[] args) {
		int[] numbers = new int[] { 5, 1, 3, 8, 2 };

		sort(numbers);
		System.out.println(numbers);
	}

	public static void sort(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			for (int j = numbers.length - 1; j > i; j--) {
				if (numbers[j] < numbers[j - 1]) {
					swap(numbers, j, j - 1);
				}
			}
		}
	}

	public static void swap(int[] array, int from, int to) {
		int temp = array[from];
		array[from] = array[to];
		array[to] = temp;
	}

}
