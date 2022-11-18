import java.util.Scanner;
import static java.lang.System.*;

public class chapter3_prob7_InchConversion {
    static Scanner kbd = new Scanner(in);
    public static void main(String[] args) {
        out.print("Enter a number of inches: ");
        float inches = kbd.nextFloat();
        convertToFeet(inches);
        convertToYards(inches);
    }
    public static void convertToFeet(float inches) {
        out.print("There are 12 inches in a foot.\n" + inches + " inches is equal to " + (inches / 12) + ((inches / 12 == 1)
                ? " foot." : " feet.\n"));
    }
    public static void convertToYards(float inches) {
        out.print("There are 3 feet (36 inches) in a yard.\n" + inches + " inches is equal to " + (inches / 36) + ((inches / 36 == 1) ? " yard." : " yards."));
    }
}