import java.util.Scanner;

public class NumberToLetterGrade {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.print("Test 1: ");
        var test1 = kbd.nextFloat();
        System.out.print("Test 2: ");
        var test2 = kbd.nextFloat();
        System.out.print("Test 3: ");
        var test3 = kbd.nextFloat();
        System.out.print("Test 4: ");
        var test4 = kbd.nextFloat();
        System.out.print("Enter your numeric grade: ");
        System.out.println(getLetterGrade(kbd.nextFloat()));
        System.out.println(getTestAverage(test1,test2,test3,test4));
    }
    public static char getLetterGrade(float overallavg) {
        if (overallavg >= 90) return 'A';
        else if (overallavg >= 80) return 'B';
        else if (overallavg >= 70) return 'C';
        else if (overallavg >= 60) return 'D';
        else return 'F';

    }
    public static float getTestAverage(float test1, float test2, float test3, float test4) {
        return (test1 + test2 + test3 + test4) / 4;
    }
}