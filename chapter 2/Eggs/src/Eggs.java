import java.util.Scanner;
public class Eggs {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		final double DOZEN_PRICE = 3.25;
		final double ONE_EGG_PRICE = 0.45;
		System.out.print("Enter the number of eggs: ");
		int eggs = keyboard.nextInt();
		int numberofdozens = (int) Math.floor(eggs / 12);
		double totalprice = ((numberofdozens * DOZEN_PRICE) + ((eggs % 12) * ONE_EGG_PRICE));
		System.out.print("The total price for " + eggs + " eggs is $" + totalprice + " for " + numberofdozens + " dozen at $" + DOZEN_PRICE + " each and " + (eggs % 12) + " individual eggs at $" + ONE_EGG_PRICE + " each.");
	}
}
