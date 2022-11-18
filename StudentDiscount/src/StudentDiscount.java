import javax.swing.*;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
import static java.lang.System.*;

public class StudentDiscount {
    static Scanner kbd = new Scanner(in);
    static float tuition = 45000;
    public static void main(String[] args) {
        out.print("Use (s)canner or (w)indow method? ");
        if (kbd.nextLine().equalsIgnoreCase("s")) {
            getInfo("s");
        }
        else {
            getInfo("w");
        }
    }
    public static void getInfo(String method) {
        if (method.equals("s")) {
            out.print("Is your parent employed by the college? (y/n) ");
            boolean parentemp = kbd.next().equalsIgnoreCase("y");
            out.print("Are you a student athlete? (y/n) ");
            boolean studentathlete = kbd.next().equalsIgnoreCase("y");
            out.print("Do your parents make over $100,000 combined? (y/n) ");
            boolean over100k = kbd.next().equalsIgnoreCase("y");
            out.print("How many semesters do you plan to attend? ");
            int semesters = kbd.nextInt();
            applyDiscounts(parentemp, studentathlete, over100k, semesters, "s");
        }
        else {
            boolean parentemp = (JOptionPane.showConfirmDialog(null, "Is one of your parents employed by the college?", "Parent Employee", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION);
            boolean studentathlete = (JOptionPane.showConfirmDialog(null, "Are you a student athlete?", "Student Athlete", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION);
            boolean over100k = (JOptionPane.showConfirmDialog(null, "Do your parents make over $100,000 combined?", "Parental Income", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION);
            int semesters = Integer.parseInt(JOptionPane.showInputDialog(null, "How many semesters do you plan to attend?", JOptionPane.QUESTION_MESSAGE));
            applyDiscounts(parentemp, studentathlete, over100k, semesters, "w");
        }
    }
    public static void parentEmp(boolean parentemp) {
        if (parentemp) tuition *= .5;
    }
    public static void studentAthlete(boolean studentathlete) {
        if (studentathlete) tuition *= .8;
    }
    public static String checkOrX(boolean discount) {
        return ((discount) ? "✔" : "❌");
    }
    public static void applyDiscounts(boolean parentemp, boolean studentathlete, boolean over100k, int semesters, String calledby) {
        parentEmp(parentemp);
        studentAthlete(studentathlete);
        String FAavailable = (over100k) ? "You do not qualify for financial aid." : "You qualify for financial aid.";
        String finaltuition = NumberFormat.getCurrencyInstance(new Locale("en", "US")).format(tuition * semesters);
        if (calledby.equals("s")) {
            out.print("Your final tuition is " + finaltuition + " for " + semesters + " semester(s)\nDiscounts:\n" + checkOrX(parentemp) + " Parent Employee\n" + checkOrX(studentathlete) + " Student Athlete\n" + FAavailable);
        }
        else {
            JOptionPane.showMessageDialog(null, "Your final tuition is " + finaltuition + " for " + semesters + " semester(s)\nDiscounts:\n" + checkOrX(parentemp) + " Parent Employee\n" + checkOrX(studentathlete) + " Student Athlete\n" + FAavailable);
        }
        kbd.close();
    }
}