package numbergame;
import javax.swing.JOptionPane;

public class numbergame {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null,"First, think of a number from 1 to 10.");
		JOptionPane.showMessageDialog(null,"The computer's choice is " + (1 + (int)(Math.random() * 10)));
	}
	
}
