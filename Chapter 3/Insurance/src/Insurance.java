import java.util.Calendar;
import java.util.Scanner;
import static java.lang.System.*;

public class Insurance {
    static Scanner kbd = new Scanner(in);
    public static void main(String[] args) {
        var year = Calendar.getInstance().get(Calendar.YEAR);
        out.print("Enter your age: ");
        int age = kbd.nextInt();
        out.print("Your insurance premium is $" + calcPremium(year, age));
    }
    public static String calcPremium(int year, int age) {
        return String.format("%.2f", (Math.floor((age / 10.0)) + 15) * 20);
    }
}