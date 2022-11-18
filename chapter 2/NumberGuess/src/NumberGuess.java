import java.util.Scanner;

public class NumberGuess {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Guess a number from 1 to 5 ");
		int playerGuess = keyboard.nextInt();
		int computerNumber = (1 + (int)(Math.random() * 5));
		System.out.print((playerGuess == computerNumber) ? "That's right! Good job!" : "Oops! That's wrong. The computer picked " + computerNumber + ". You were off by " + Math.abs(playerGuess - computerNumber) + ".");
		keyboard.close();
	}
}
