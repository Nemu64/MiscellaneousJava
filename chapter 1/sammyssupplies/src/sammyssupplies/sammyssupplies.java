package sammyssupplies;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class sammyssupplies {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		JOptionPane.showMessageDialog(null, "SsSsSsSsSsSsSsSsSsSsSsSsSsSsS\nS  Sammy's makes it fun in the sun.   S\nSsSsSsSsSsSsSsSsSsSsSsSsSsSsS");
		System.out.print("How long (in minutes) was the equipment rented for? ");
		int time = keyboard.nextInt();
		int hours = time / 60;
		int mins = time % 60;
		JOptionPane.showMessageDialog(null, "The total price is $" + ((hours * 40) + mins) + ". That breaks down to $" + (hours * 40) + " for " + hours + " hour(s) and $" + mins + " for " + mins + " minute(s)." );
		keyboard.close();
	}
}
