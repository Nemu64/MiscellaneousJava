import java.util.Scanner;
public class ChiliToGo {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		final int ADULT_PRICE = 7;
		final int CHILD_PRICE = 4;
		System.out.print("Enter the number of adult meals: ");
		int adultmeals = keyboard.nextInt();
		System.out.print("Enter the number of child meals: ");
		int childmeals = keyboard.nextInt();
		int adulttotal = ADULT_PRICE * adultmeals;
		int childtotal = CHILD_PRICE * childmeals;
		System.out.print("Price for adult meals: $" + adulttotal + " (" + adultmeals + ")\nPrice for child meals: $" + childtotal + " (" + childmeals + ")\nTotal price: $" + (adulttotal + childtotal));
		
	}

}
