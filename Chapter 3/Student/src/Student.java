import java.util.Scanner;
import static java.lang.System.*;

class StudentData {
    int studentID;
    float creditHours;
    float numOfPoints;
    float gpa;
    public int getStudentID() {return studentID;}
    public float getCreditHours() {return creditHours;}
    public float getNumOfPoints() {return numOfPoints;}
    public float getGPA() {return calcGPA(creditHours, numOfPoints);}
    public void setStudentID(int setID) {this.studentID = setID;}
    public void setCreditHours(float credits) {this.creditHours = credits;}
    public void setNumOfPoints(float points) {this.numOfPoints = points;}
    public static float calcGPA(float creditHours, float numOfPoints) {
        return numOfPoints / creditHours;
    }
    public StudentData() {
        studentID = 9999;
        creditHours = 3;
        numOfPoints = 12;
        gpa = calcGPA(creditHours, numOfPoints);
    }
}

public class Student {

    static StudentData someStudent = new StudentData();
    static Scanner kbd = new Scanner(in);
    public static void main(String[] args) {
        out.print("\n\nPress (s) to set values, (d) to display them, (t) to display test data, or (e) to exit: ");
        switch (kbd.next().toLowerCase()) {
            case "s" -> {
                out.print("Enter the student ID: ");
                someStudent.setStudentID(kbd.nextInt());
                out.print("Enter the student's credit hours: ");
                someStudent.setCreditHours(kbd.nextFloat());
                out.print("Enter the student's number of points: ");
                someStudent.setNumOfPoints(kbd.nextFloat());
                printValues();
                main(null);
            }
            case "d" -> {
                printValues();
                main(null);
            }
            case "t" -> {
                someStudent = new StudentData();
                printValues();
                main(null);
            }
            case "e" -> exit(0);
            default -> {
                out.println("Not sure what you mean by that.");
                main(null);
            }
        }

    }
    public static void printValues() {
        out.print("Current values are: \nStudent ID: " + someStudent.getStudentID() + "\nCredit hours: " + someStudent.getCreditHours() + "\nPoints earned: " + someStudent.getNumOfPoints() + "\nGPA: " + someStudent.getGPA());
    }
}