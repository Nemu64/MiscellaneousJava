import java.util.Scanner;
import java.util.Calendar;

public class TestMii {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		selectProject();
		keyboard.close();
		System.out.print("\nGoodbye!");
	}
	public static void selectProject() {
		System.out.print(getGreeting() + " Which project should be executed?\n\nAvailable projects:\n\n1: Display address\n2: Calculate pay by hour\nO: Exit\n\n? ");
		switch (keyboard.nextInt()) {
		case 1: 
			displayAddress();
			break;
		case 2: 
			System.out.print("Number of hours? ");
			calculateGross(keyboard.nextDouble());
			break;
		case 0: return;
		default:
			System.out.print("\nI don't know what you mean by that.\n\n");
			selectProject();
		}
	}
	public static void displayAddress() {
		System.out.print(8*8*8*8*8*8);
		System.out.print("8900 US Hwy 14\n");
		System.out.print("Crystal Lake, IL 60014\n");
	}
	public static void calculateGross(double hours) {
		final double STD_RATE = 13.75;
		double gross = hours * STD_RATE;
		System.out.print(hours + " hours at $" + STD_RATE + " per hour is $" + gross);
	}
	public static String getGreeting() {
		Calendar cal = Calendar.getInstance();
		int time = cal.get(Calendar.HOUR_OF_DAY);
		if (time <= 12) {return "Good morning!";}
		else if (time <= 16) {return "Good afternoon!";}
		else if (time <= 20) {return "Good evening!";}
		else {return "Good night!";}
	}
}
