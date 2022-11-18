import javax.swing.*;

public class WordCounter {
    public static void main(String[] args) {
        String words = new String(JOptionPane.showInputDialog(null, "Enter some text", "Text input", JOptionPane.QUESTION_MESSAGE));
        int countWords = words.split("\\s").length;
        JOptionPane.showMessageDialog(null, "I counted " + countWords + " words.");
        var x = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?","Really exit?",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
    }
}