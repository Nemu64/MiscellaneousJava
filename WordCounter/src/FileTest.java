import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {
    static int numoffiles = 0;
    static double time = 0;
    static String ismanyfiles;
    static String plurality;
    static boolean erroroccured;
    static String isdone = "[\u001B[32mOK\u001B[0m] ";
    static String isworking = "[\u001B[33mWORKING\u001B[0m] ";

    static String hasfaileddialog = "<html>[<font color='red'>FAILED</font>] ";
    static String hasfailed = "[\u001B[31mFAILED\u001B[0m] ";
    public static void main(String[] args) throws InterruptedException {
            try {
                numoffiles = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of files to create:\n(or leave blank for random)", "Number of files", JOptionPane.QUESTION_MESSAGE));
                if (numoffiles < 1) {
                    JOptionPane.showMessageDialog(null, "You must provide a number greater than 0.");
                    main(null);
                }
                if (numoffiles > 10000 && JOptionPane.showConfirmDialog(null, "Creating this many files may take a very long time and can cause unnecessary wear on your hard drive.\n\nAre you sure you want to contine?", "Large number of files", JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION) {
                    main(null);
                }
            }
            catch (Exception e) {
                numoffiles = (int) (Math.random() * 10000);
            }
            plurality = (numoffiles == 1) ? "file" : "files";
            ismanyfiles = (numoffiles > 1000) ? " A LOT of files! " : " " + plurality + "! ";
            createFiles(numoffiles);
            if (JOptionPane.showConfirmDialog(null, "Write test data to the " + plurality + "?\n(if you click No, the " + plurality + " will just be deleted)" ,"Write test data", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) writeData(numoffiles);
            deleteFiles(numoffiles);
    }
    public static void createFiles(int numoffiles) throws InterruptedException {
        try {
            timeTaken("start");
            for (int x = 0; x < numoffiles; x++) {
                File newfile = new File("testfile" + (x + 1) + ".txt");
                newfile.createNewFile();
                System.out.print((((x == (numoffiles - 1)) ? isdone : isworking) + "Saving" + ismanyfiles + "(" + (x + 1) + "/" + numoffiles + ")\r"));
                System.out.flush();
            }
            JOptionPane.showMessageDialog(null, "Successfully created " + numoffiles + " " + plurality + " in " + timeTaken("stop"));
        }
        catch (IOException e) {
            System.out.print(hasfailed + "to create files!)");
            JOptionPane.showMessageDialog(null, hasfaileddialog + "to create " + plurality + "!</html>");
        }
    }
    public static void writeData(int numoffiles) {
        timeTaken("start");
        try {
            for (int x = 0; x < numoffiles; x++) {
                FileWriter currentFile = new FileWriter("testfile" + (x + 1) + ".txt");
                currentFile.write("This is file " + (x + 1) + " of " + numoffiles);
                currentFile.close();
                System.out.print(((x == (numoffiles - 1)) ? isdone : isworking) + "Writing data to" + ismanyfiles + "(" + (x + 1) + "/" + numoffiles + ")\r");
                System.out.flush();
            }
            JOptionPane.showMessageDialog(null, "Successfully wrote data to " + numoffiles + " " + plurality + " in " + timeTaken("stop") + ".\n\nClick OK to delete the " + plurality + ".");
        }
        catch (IOException e) {
            System.out.print(hasfailed + "to write to " + plurality + "!");
            JOptionPane.showMessageDialog(null, hasfaileddialog + "to write to " + plurality + "!</html>");
        }
    }
    public static void deleteFiles(int numoffiles) throws InterruptedException {
        timeTaken("start");
        int failedfiles = 0;
        String failedmessage = "";
        for (int x = 0; x < numoffiles; x++) {
            File newfile = new File("testfile" + (x + 1) + ".txt");
            if (!newfile.delete()) {
                failedfiles++;
                erroroccured = true;
                System.out.print(hasfailed + "to delete " + plurality + "!");
                if (JOptionPane.showConfirmDialog(null, "A file could not be deleted, but it may be possible to continue.\n\nDo you want to attempt to continue?", "An error occurred", JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION) break;
            }
            System.out.print(((x == (numoffiles - 1)) ? isdone : isworking) + "Deleting" + ismanyfiles + "(" + (x + 1) + "/" + numoffiles + ")\r");
            System.out.flush();
        }
        if (erroroccured) {
            JOptionPane.showMessageDialog(null, "Unfortunately, some files could not be deleted.");
            failedmessage = "\n(could not delete " + failedfiles + ((failedfiles > 1) ? " files)" : " file)");
        }
        JOptionPane.showMessageDialog(null, "Successfully deleted " + (numoffiles - failedfiles) + " " + plurality + " in " + timeTaken("stop") + "." + failedmessage);
        System.exit(0);
    }
    public static String timeTaken(String s) {
        if (s.equals("start")) {
            time = System.nanoTime();
        }
        else if (s.equals("stop")) {
            time = (System.nanoTime() - time) / 1000000;
        }
        return String.format("%.3f", time) + "ms";
    }
}
