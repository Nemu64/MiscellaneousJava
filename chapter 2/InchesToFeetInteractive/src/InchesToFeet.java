import java.util.Scanner;
public class InchesToFeet {

		public static void main(String[] args) {
			Scanner keyboard = new Scanner(System.in);
			final int INCHES_IN_FEET = 12;
			System.out.print("Enter a number of inches: ");
			int totalinches = keyboard.nextInt();
			System.out.print(totalinches + " inches is equivalent to " + (totalinches / INCHES_IN_FEET) + " feet and " + (totalinches % INCHES_IN_FEET) + " inches.");
		}
}
