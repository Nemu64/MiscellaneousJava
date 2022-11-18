import javax.swing.*;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import static java.lang.Float.parseFloat;

// These are static variables that are used throughout the program
public class Grades {
    static String studentName;
    static String collegeName;
    static float test1;
    static float test2;
    static float test3;
    static float test4;
    static float quiz1;
    static float quiz2;
    static float quiz3;
    static float quiz4;
    static float hwGrade;
    static float attendanceGrade;

    //We don't need to pass data to this method. It takes the data from the static variables
    public static float getTestAverage() {
        return (test1 + test2 + test3 + test4) / 4;
    }
    //Same for this method
    public static float getQuizAverage() {
        return (quiz1 + quiz2 + quiz3 + quiz4) / 4;
    }
    //And this one too
    public static float getOverallGrade() {
        return (float) ((getTestAverage() * .6) + (getQuizAverage() * .2) + (hwGrade * .1) + (attendanceGrade * .1));
    }
    //This method should be called with getOverallGrade() as the parameter
    public static char getLetterGrade(float overallavg) {
        if (overallavg >= 90) return 'A'; //We have to use if/else here since were using greater than or equal to
        else if (overallavg >= 80) return 'B';
        else if (overallavg >= 70) return 'C';
        else if (overallavg >= 60) return 'D';
        else return 'F';
    }
    //This method should be called with getLetterGrade() as the parameter
    public static int getGPA(char letter) {
        switch (letter) { //More concise than if/else (sort of)
            case 'A' -> {
                return 4;
            }
            case 'B' -> {
                return 3;
            }
            case 'C' -> {
                return 2;
            }
            case 'D' -> {
                return 1;
            }
            case 'F' -> {
                return 0;
            }
        }
        return letter; //We still need to return something here, but it will get overridden by the switch statement
    }
    //This method saves the results to a file
    public static String saveResults() {
        try {
            FileWriter fw = new FileWriter("results.txt"); //We aren't allowing the user to select the file name. This could result in data loss but oh well
            fw.write("Student name: " + studentName +
                "\nCollege name: " + collegeName +
                "\nTest average: " + getTestAverage() +
                "\nQuiz average: " + getQuizAverage() +
                "\nOverall average: " + getOverallGrade() +
                "\nLetter grade: " + getLetterGrade(getOverallGrade()) +
                "\nGPA: " + getGPA(getLetterGrade(getOverallGrade())));
            fw.close();
        }
        catch (IOException e) {return "Error saving results to file";} //The return string is used in the results window. We aren't using a popup window here because it would be annoying
        return "These results have been saved to results.txt";
    }
    //This method needs a parent dialog and whether to open or save a file
    public static File pickFile(JFrame parent, char opensave) {
        try {
            if (opensave == 'o') { //If 'o' is passed, we open a file
                NewInputWindow.chooser.setDialogTitle("Choose a student information file to open");
                NewInputWindow.chooser.showOpenDialog(parent);
            }
            else { //If 's', we save a file
                NewInputWindow.chooser.setDialogTitle("Choose where to save the student information file");
                NewInputWindow.chooser.showSaveDialog(parent);
            }
            return NewInputWindow.chooser.getSelectedFile(); //Return the selected file
        }
        catch (NullPointerException e) { //If the user cancels the file chooser, we get a null pointer exception, so we return null
            return null;
        }
    }
    //If the user selects a valid file, this method will read the data from it
    public static void readFile(JFrame parent, File file) {
        if (file != null) { //Obviously, we can't read from a null file
            try {
                Scanner reader = new Scanner(file);
                studentName = reader.nextLine().split(":")[1]; //Sadly, we can't shorten this to a loop
                collegeName = reader.nextLine().split(":")[1];
                test1 = parseFloat(reader.nextLine().split(":")[1]);
                test2 = parseFloat(reader.nextLine().split(":")[1]);
                test3 = parseFloat(reader.nextLine().split(":")[1]);
                test4 = parseFloat(reader.nextLine().split(":")[1]);
                quiz1 = parseFloat(reader.nextLine().split(":")[1]);
                quiz2 = parseFloat(reader.nextLine().split(":")[1]);
                quiz3 = parseFloat(reader.nextLine().split(":")[1]);
                quiz4 = parseFloat(reader.nextLine().split(":")[1]);
                hwGrade = parseFloat(reader.nextLine().split(":")[1]);
                attendanceGrade = parseFloat(reader.nextLine().split(":")[1]);
                parent.setVisible(false); //If the file is valid, jump to the is correct window
                reader.close();
                JFrame iscorrect = new NewIsCorrectWindow(parent); //We need to store the window as a variable, so we can center it
                Grades.center(iscorrect);
                iscorrect.setVisible(true); //We'll keep the window hidden until it's been centered, otherwise it will jump around
            }
            catch (FileNotFoundException | NumberFormatException | IndexOutOfBoundsException e) { //If any part of the file is invalid, this will be thrown
                NewInputWindow.errorOccurred("filereaderror");
            }
        }
    }
    //This is used to save the entered data to a file. It needs a parent dialog and the file to save to. It is not the same as saveResults()
    public static boolean writeFile(File file) {
        try {
            if (!file.toPath().endsWith(".txt")) file = new File(file.getPath() + ".txt"); //If the selected file doesn't end with .txt, add it
            FileWriter fw = new FileWriter(file);
            fw.write("studentName:" + studentName +
                    "\ncollegeName:" + collegeName +
                    "\ntest1:" + test1 +
                    "\ntest2:" + test2 +
                    "\ntest3:" + test3 +
                    "\ntest4:" + test4 +
                    "\nquiz1:" + quiz1 +
                    "\nquiz2:" + quiz2 +
                    "\nquiz3:" + quiz3 +
                    "\nquiz4:" + quiz4 +
                    "\nhwGrade:" + hwGrade +
                    "\nattendanceGrade:" + attendanceGrade);
            fw.close();
        }
        catch (IOException e) {
            file.delete(); //If there is an error, delete the file. We don't care if the delete succeeds or not
            NewInputWindow.errorOccurred("saveerror");
            return false; //Return false to indicate that the file was not saved
        }
        return true; //Return true to indicate that the file was saved
    }
    public static void center(JFrame frame) { //This method centers the window on the screen
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize(); //We need the screen size to do some math
        int width = frame.getSize().width; //As well as the window size
        int height = frame.getSize().height;
        int x = (dim.width - width) / 2;
        int y = (dim.height - height) / 2;
        frame.setLocation(x, y); //We move the window to the calculated coordinates

    }
}