package carlysmotto;
import javax.swing.JOptionPane;

public class chapter2_caseproblem1_CarlysEventPrice {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "******************************************************\n* Carly’s makes the food that makes it a party. *\n******************************************************");
		int numofpeople = Integer.parseInt(JOptionPane.showInputDialog(null, "How many guests are attending the event?", "Number of guests", JOptionPane.QUESTION_MESSAGE));
		JOptionPane.showMessageDialog(null, "At $35 per guest, the total comes to $" + (numofpeople * 35) + " for " + numofpeople +" guests. " + ((numofpeople >= 50) ? "Because there are 50 guests or more, this WILL be considered a large event" : "Because there are less than 50 guests, this will NOT be considered a large event."));
	}

}
