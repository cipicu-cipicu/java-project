import java.util.ArrayList;
import java.util.List;

public class PrimitiveTypesWrapperObjects {

	public static void main(String[] args) {

		/*
		byte    - Stores whole numbers from -128 to 127
		short   - Stores whole numbers from -32,768 to 32,767
		int     - Stores whole numbers from -2,147,483,648 to 2,147,483,647
		long    - Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		float   - Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
		double  - Stores fractional numbers. Sufficient for storing 15 decimal digits
		boolean - Stores true or false values
		char    - Stores a single character/letter or ASCII values
		*/
		
		// byte
		byte simpleByte = 0xF;
		Byte wrapperByte = new Byte((byte) 0x9);
		System.out.println("Byte primitive type = " + simpleByte);
		System.out.println("Byte wrapper object = " + wrapperByte);
		
		// short
		short simpleShort = 2;
		Short wrapperShort = new Short((short) 2);
		
		int simpleInt = 23;
		
		// autoboxing
		// Integer wrapperInt = new Integer(45);
		Integer wrapperInt = 45;
		System.out.println("Int primitive type = " + simpleInt);
		System.out.println("Int wrapper object = " + wrapperInt);
		
		// unboxing
		int unboxedInt = wrapperInt;
		System.out.println("Unboxed Int = " + unboxedInt);

		List<Integer> li = new ArrayList<>();
		for (int i = 1; i < 50; i++) {
		    //boxing li.add(Integer.valueOf(i));
			li.add(i);
		}
		
		int sum = 0;
	    for (Integer intObject: li) {
	    	// intObject is unboxed: intObject.intValue() 
	    	sum += intObject;
	    }
	    System.out.println("sum = " + sum);
	    
	    // add a line that takes a string representing an integer (e.g. "25"), and outputs a string of
	    // the initial value multiplied by 3
	
	}

}
