import java.util.Scanner;
public class TriangleAreaSolver {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a value for side A: ");
		double a = keyboard.nextDouble();
		System.out.print("Enter a value for side B: ");
		double b = keyboard.nextDouble();
		System.out.print("Enter a value for side C: ");
		double c = keyboard.nextDouble();
		System.out.print((a + b > c && b + c > a && c + a > b) ? "The area for this trangle is: " + (.25*(Math.sqrt((a+b+c)*(-a+b+c)*(a-b+c)*(a+b-c)))) : "That does not appear to be a valid triangle.");
		keyboard.close();
	}

}
