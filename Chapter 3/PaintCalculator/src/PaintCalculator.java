import java.util.Scanner;
import static java.lang.System.*;

public class PaintCalculator {
    static Scanner kbd = new Scanner(in);
    public static void main(String[] args) {
        out.print("Enter the length of the room in feet: ");
        float length = kbd.nextFloat();
        out.print("Enter the width of the room in feet: ");
        float width = kbd.nextFloat();
        out.print("Enter the height of the room in feet: ");
        float height = kbd.nextFloat();
        out.print("The final price is $" + calcWallarea(length, width, height));
    }
    public static String calcWallarea(float length, float width, float height) {
        var wallarea = (2 * (length * (height + width) + height * width)) - ((length * width) * 2); //compute the surface area of the room minus the ceiling and floor
        out.println("To cover " + wallarea + " feet, you will need " + gallonsNeeded(wallarea) + " gallons of paint.");
        return String.format("%.2f", gallonsNeeded(wallarea) * 32);
    }
    public static float gallonsNeeded(float wallarea) {
        return (wallarea / 350);
    }
}