import java.util.Scanner;
public class Tester {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Hi");
		String text = keyboard.next();
		if (text.contentEquals("") || text.trim().length() == 0) {
		System.out.print("true");
		}
		else {
			System.out.print("nope");
		}
	}

}
