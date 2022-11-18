import java.util.Scanner;
public class chapter2_prob7_MilesConversionsInteractive {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		final int INCHES_IN_MILE = 63360;
		final int FEET_IN_MILE = 5280;
		final int YARDS_IN_MILE = 1760;
		System.out.print("Enter a number of miles: ");
		double miles = keyboard.nextDouble();
		System.out.print("In " + miles + " miles there are:\n" + (miles * INCHES_IN_MILE) + " inches\n" + (miles * FEET_IN_MILE) + " feet\n" + (miles * YARDS_IN_MILE) + " yards");
	}

}
