package carlysmotto;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class carlysmotto {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		JOptionPane.showMessageDialog(null, "******************************************************\n* Carly’s makes the food that makes it a party. *\n******************************************************");
		System.out.print("How many guests are attending the event? ");
		int numofpeople = keyboard.nextInt();
		JOptionPane.showMessageDialog(null, "At $35 per guest, the total comes to $" + (numofpeople * 35) + " for " + numofpeople +" guests. " + ((numofpeople >= 50) ? "Because there are 50 guests or more, this WILL be considered a large event" : "Because there are less than 50 guests, this will NOT be considered a large event."));
		keyboard.close();
	}

}
