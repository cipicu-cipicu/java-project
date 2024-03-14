package com.dm.sort;

import java.util.Arrays;
import java.util.Collections;

public class BubbleSortExample {

	public static void main(String[] args) {
		int[] numbersArray = new int[30];
		
		for (int i = 0; i < 30; i++) {
			numbersArray[i] = (int) (99 * Math.random());
		}
		
		printArrayOfNumbers(numbersArray);

		// sort numbers ascending
		// ... include code here
		printArrayOfNumbers(numbersArray);
		
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
