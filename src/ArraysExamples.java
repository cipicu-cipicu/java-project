import java.util.Arrays;

public class ArraysExamples {

	public static void main(String[] args) {
		
		// an array is a data structure that stores a collection of values
		// of the same type. Created using the "new" operator
		int[] intArray = new int[100];
		
		// we can also initialize and assign initial values
		int[] intArray2 = {1, 3, 5};
		for (int i = 0; i < intArray2.length; i++) {
			System.out.println(intArray2[i]);
		}
		System.out.println("");
		
		// for each loop - shortcut to iterate a collection
		// for (variabile : collection) statement
		for (int intElement: intArray2) {
			System.out.println(intElement);
		}
		System.out.println("");
		
		// assign an array variable vs copy (clone) the content
		System.out.println("intArray2 before");
		printArray(intArray2);
		int[] intArray3 = intArray2;
		intArray3[0] = 7;
		System.out.println("intArray2 after");
		printArray(intArray2);
		
		// cloning the array
		int[] intArray4 = Arrays.copyOf(intArray2, intArray2.length);
		intArray4[0] = 33;
		System.out.println("intArray2 after cloning");
		printArray(intArray2);
		
		// note - an array has a fixed length. For a variable length array - use an object
		// such as "ArrayList"
		
	}
	
	public static void printArray(int[] intArray) {
		for (int intElement: intArray) {
			System.out.println(intElement);
		}
		System.out.println("");
	}

}
