import java.util.Scanner;
public class MultipleOfFiveAndSeven {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a number: ");
		double num = keyboard.nextDouble();
		System.out.print((num % 5 == 0 && num % 7 == 0) ? "That number is a multiple of 5 and 7" : "That number is NOT a multiple of 5 and 7");
	}

}