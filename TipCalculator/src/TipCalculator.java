import javax.swing.*;
public class TipCalculator {
    public static void main(String[] args) {
        float billprice = Float.parseFloat(JOptionPane.showInputDialog(null, "What is the total bill amount?", "Bill amount", JOptionPane.QUESTION_MESSAGE));
        String sevicequality = JOptionPane.showInputDialog(null, "Was you service acceptable today? (y/n)", "Service quality", JOptionPane.QUESTION_MESSAGE);
        if (sevicequality.equals("n")) {
            JOptionPane.showMessageDialog(null, "The total bill amount is $" + String.format("%.2f", billprice * .85) + "\n\nNo tip required.");
        }
        else {
            if (billprice <= 100) {
                JOptionPane.showMessageDialog(null, "The total bill amount is $" + String.format("%.2f", billprice * 1.15));
            }
            else if (billprice <= 150) {
                JOptionPane.showMessageDialog(null, "The total bill amount is $" + String.format("%.2f",billprice * 1.2));
            }
            else if (billprice > 151){
                JOptionPane.showMessageDialog(null, "The total bill amount is $" + String.format("%.2f",billprice * 1.25));
            }
            else {
                JOptionPane.showMessageDialog(null, "I'm not sure how to compute a tip for that amount.");
            }
        }
    }
}