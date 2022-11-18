public class chapter2_debugging_Debug3 { // Demonstrates remainder and output
	
	public static void main(String args[]) {
		int a = 99, b = 8, result;
		long c = 7777777777777L;
		result = a % b;
		System.out.println("Divide " + a + " by " + b + " = " + (a / b));
		System.out.println("remainder is " + (a % b));
		System.out.print("c is a very large number: ");
		System.out.println(c);
	}
}
