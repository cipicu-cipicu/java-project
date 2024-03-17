package com.dm.sort;

import java.util.Arrays;

public class BubbleSortExample {

	public static void main(String[] args) {
		int[] numbersArray = new int[30];

		for (int i = 0; i < 30; i++) {
			numbersArray[i] = (int) (99 * Math.random());
		}

		printArrayOfNumbers(numbersArray);
		for (int p = 0; p < numbersArray.length; p++) {
			for (int i = 0; i < (numbersArray.length - 1); i++) {
				int value1 = numbersArray[i];
				int value2 = numbersArray[i + 1];
				if (value1 > value2) {
					numbersArray[i] = value2;
					numbersArray[i + 1] = value1;
				}
			}
		}
		// sort numbers ascending
		// ... include code here
		printArrayOfNumbers(numbersArray);
		for (int p = 0; p < numbersArray.length; p++) {
			for (int i = 0; i < (numbersArray.length - 1); i++) {
				int value1 = numbersArray[i];
				int value2 = numbersArray[i + 1];
				if (value1 < value2) {
					numbersArray[i] = value2;
					numbersArray[i + 1] = value1;
				}
			}
		}
		// sort numbers descending
		// ... include code here
		printArrayOfNumbers(numbersArray);

	}

	public static void printArrayOfNumbers(int[] numbers) {

		if (numbers == null || numbers.length == 0) {
			System.out.println("empty list!");
		} else {
			String result = Integer.toString(numbers[0]);
			for (int i = 1; i < numbers.length; i++) {
				result = result + ", " + Integer.toString(numbers[i]);
			}
			System.out.println(result);
		}
	}

}
