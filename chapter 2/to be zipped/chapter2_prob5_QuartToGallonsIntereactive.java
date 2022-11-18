import java.util.Scanner;
public class chapter2_prob5_QuartToGallonsIntereactive {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		final int QUARTS_IN_GALLON = 4;
		System.out.print("How many quarts are needed for the project? ");
		int quartsneeded = keyboard.nextInt();
		System.out.print("For a job that requires " + quartsneeded + " quarts of paint, you would need " + (quartsneeded / QUARTS_IN_GALLON) + " gallon(s) and " + (quartsneeded % QUARTS_IN_GALLON) + " quart(s).");
	}
}
