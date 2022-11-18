package sammyssupplies;
import javax.swing.JOptionPane;

public class chapter2_caseproblem2_SammysRentalPrice {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "SsSsSsSsSsSsSsSsSsSsSsSsSsSsS\nS  Sammy's makes it fun in the sun.   S\nSsSsSsSsSsSsSsSsSsSsSsSsSsSsS");
		int time = Integer.parseInt(JOptionPane.showInputDialog(null, "How long (in minutes) was the equipment rented for?", "Rental time", JOptionPane.QUESTION_MESSAGE));
		int hours = time / 60;
		int mins = time % 60;
		JOptionPane.showMessageDialog(null, "The total price is $" + ((hours * 40) + mins) + ". That breaks down to $" + (hours * 40) + " for " + hours + " hour(s) and $" + mins + " for " + mins + " minute(s)." );
	}
}
