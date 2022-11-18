import java.util.Scanner;

public class TestMii {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.print("Enter a grade: ");
        float grade = kbd.nextFloat();
        System.out.println((grade > 0) ? "Grade is positive" : "Grade is negative");
        System.out.println((grade % 2 == 0) ? "Grade is even" : "Grade is odd");
    }
}
