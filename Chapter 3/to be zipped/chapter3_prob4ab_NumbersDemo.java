import java.util.Scanner;
import static java.lang.System.*;

public class chapter3_prob4ab_NumbersDemo {
    static Scanner kbd = new Scanner(in);
    public static void main(String[] args) {
        var x = 5;
        var y = 10;
        out.print("Do you want to specify the numbers yourself? (y/n) ");
        if (kbd.next().equalsIgnoreCase("y")) getNumbers();
        displayTwiceTheNumber(x, y);
        displayNumberPlusFive(x, y);
        displayNumberSquared(x, y);
    }
    public static void getNumbers() {
        out.print("Enter an integer: ");
        int x = kbd.nextInt();
        out.print("Enter another integer: ");
        int y = kbd.nextInt();
        displayTwiceTheNumber(x, y);
        displayNumberPlusFive(x, y);
        displayNumberSquared(x, y);
        exit(0);
    }
    public static void displayTwiceTheNumber(int x, int y) {
        out.println("Twice " + x + " is " + (x * 2));
        out.println("Twice " + y + " is " + (y * 2));
    }
    public static void displayNumberPlusFive(int x, int y) {
        out.println(x + " + 5 is " + (x + 5));
        out.println(y + " + 5 is " + (y + 5));
    }
    public static void displayNumberSquared(int x, int y) {
        out.println(x + " squared is " + (x * x));
        out.println(y + " squared is " + (y * y));
    }
}