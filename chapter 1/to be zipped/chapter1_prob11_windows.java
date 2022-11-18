import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class windows {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Main Window");
		JOptionPane.showMessageDialog(frame, "No windows available for popping!", "Test window", JOptionPane.ERROR_MESSAGE);

	}

}
