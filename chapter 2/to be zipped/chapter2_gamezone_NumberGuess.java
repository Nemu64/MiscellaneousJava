import javax.swing.JOptionPane;

public class chapter2_gamezone_NumberGuess {
	public static void main(String[] args) {
		int playerGuess = Integer.parseInt(JOptionPane.showInputDialog(null, "Guess a number from 1 to 5", "Your guess", JOptionPane.QUESTION_MESSAGE));
		int computerNumber = (1 + (int)(Math.random() * 5));
		JOptionPane.showMessageDialog(null, (playerGuess == computerNumber) ? "That's right! Good job!" : "Oops! That's wrong. The computer picked " + computerNumber + ". You were off by " + Math.abs(playerGuess - computerNumber) + ".");
	}
}