
public class PerformanceTester {

	public static void main(String[] args) {
		
		long startMillis = System.currentTimeMillis();
		
		for (int i = 0; i < 10000; i++) {
			String s = "abcd";
			for (int j = 0; j < 1000; j++) {
				s = s + "a";
			}
		}
		
		long endMillis = System.currentTimeMillis();
		System.out.println("milliseconds passed = " + (endMillis - startMillis));
	}

}
