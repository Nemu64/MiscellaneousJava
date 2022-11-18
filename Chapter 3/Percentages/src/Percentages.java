import java.util.Scanner;
import static java.lang.System.*;

public class Percentages {
    static Scanner kbd = new Scanner(in);
    public static void main(String[] args) {
        double x = 5;
        double y = 10;
        out.print("Do you want to specify the numbers yourself? (y/n) ");
        if (kbd.next().equalsIgnoreCase("y")) getNumbers();
        computePercentage(x, y);
        computePercentage(y, x);
    }
    public static void getNumbers() {
        out.print("Enter an number: ");
        double x = kbd.nextDouble();
        out.print("Enter another number: ");
        double y = kbd.nextDouble();
        computePercentage(x, y);
        computePercentage(y, x);
        exit(0);
    }
    public static void computePercentage(double num1, double num2) {
        out.println(num1 + " is " + (num1 / num2 * 100) + "% of " + num2);
    }
}