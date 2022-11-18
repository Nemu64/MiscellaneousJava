import java.util.Scanner;
import static java.lang.System.*;

public class chapter3_prob6_BookstoreCredit {
    static Scanner kbd = new Scanner(in);
    public static void main(String[] args) {
        out.print("Please enter your name: ");
        var name = kbd.next();
        out.print("Please enter your current GPA in the form of X.X: ");
        float gpa = kbd.nextFloat();
        showCredit(name, gpa);
    }
    public static void showCredit(String name, float gpa) {
        out.print("Hi " + name + "!\nYour GPA of " + gpa + " entitles you to a bookstore credit of $" + String.format(
                "%.2f", (gpa * 10)) + ".");
    }
}