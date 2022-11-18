import java.util.Scanner;

public class InsurancePremium {

    static Scanner keyboard = new Scanner(System.in);
    static double Premium = 2500;

    public static void main(String[] args) {
        getInfo();
        keyboard.close();
        System.out.print("\n\nGoodbye");
    }

    public static void getInfo() {
        System.out.print("What is your age? ");
        int age = keyboard.nextInt();
        System.out.print("Have you ever served in the military? ");
        String military = keyboard.next();
        System.out.print("Have you ever been employed as a teacher? ");
        String teacher = keyboard.next();
        System.out.print("Are you a new customer? ");
        String newcust = keyboard.next();
        boolean all = (age > 21 && military.equals("y") && teacher.equals("y") && newcust.equals("y"));
        doTheMath(age, military, teacher, newcust, all);
    }

    public static void doTheMath(int age, String military, String teacher, String newcust, boolean all) {
        float discount = 0;
        if (all) {
            System.out.print("\nYour final premium is $" + (Premium *= .44));
        }
        else if (age > 21) {
            if (military.equals("y")) discount += .11;
            if (teacher.equals("y")) discount += .12;
            if (newcust.equals("y")) discount += .13;
            System.out.print("\nYour final premium is $" + (Premium *= (1 - discount)));
        }
        else System.out.println("You do not qualify for any discounts.");
    }
}
    /*
    public static void displayAge(int age) {
        if (age < 21) {
            System.out.print("\nYou do not qualify for the age discount.\nGoodbye!");
            System.exit(0);
        }
        else {
            System.out.print("\nYou qualify for the age discount.");
            Premium *= .9;
        }
    }

    public static void displayAccidents(int numofaccidents) {
        if (numofaccidents != 0) {
            System.out.print("\nYou do not qualify for the accident free discount.");
        }
        else {
            System.out.print("\nYou qualify for the accident free discount.");
            Premium *= .9;
        }
    }

    public static void displayViolations(int numofviolations) {
        if (numofviolations != 0) {
            System.out.print("\nYou do not qualify for the violation free discount.");
        }
        else {
            System.out.print("\nYou qualify for the violation free discount.");
            Premium *= .9;
        }
    }*/