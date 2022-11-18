import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import static javax.swing.GroupLayout.*;
import static javax.swing.LayoutStyle.*;

public class NewResultsWindow extends JFrame { //We need to extend JFrame so that the window can be minimized

    public NewResultsWindow() {
        //Create components and assign them to variables
        resultslabel = new JLabel();
        testavg = new JLabel();
        quizavg = new JLabel();
        gpa = new JLabel();
        overallavg = new JLabel();
        lettergrade = new JLabel();
        withhonors = new JLabel();
        college = new JLabel();
        filesavedhere = new JLabel();
        overallavgtxt = new JLabel();
        gpatxt = new JLabel();
        quizavgtxt = new JLabel();
        testavgtxt = new JLabel();
        lettergradetxt = new JLabel();
        closebutton = new JButton();
        //Here we set various properties of the window and add event listeners to the buttons
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Results");
        setResizable(false);
        resultslabel.setFont(new java.awt.Font("Segoe UI", 1, 24));
        resultslabel.setHorizontalAlignment(SwingConstants.CENTER);
        resultslabel.setText("These are your results");
        testavg.setText("Your test average: ");
        quizavg.setText("Your quiz average: ");
        gpa.setText("Your GPA: ");
        overallavg.setFont(new java.awt.Font("Segoe UI", 1, 12));
        overallavg.setText("Your overall average: ");
        lettergrade.setFont(new java.awt.Font("Segoe UI", 1, 12));
        lettergrade.setText("Letter grade: ");
        withhonors.setFont(new java.awt.Font("Segoe UI", 1, 12));
        withhonors.setText((Grades.getOverallGrade() >= 90) ? "You will graduate with honors!" : ""); //If the student has a 90 or higher, they will graduate with honors
        college.setFont(new java.awt.Font("Segoe UI", 1, 12));
        college.setText((Grades.getOverallGrade() >= 90) ? "You will go to " + Grades.collegeName + "!" : ""); //If the student has a 90 or higher, they will go to the college they entered
        filesavedhere.setFont(new java.awt.Font("Segoe UI", 1, 12));
        filesavedhere.setText(Grades.saveResults()); //This method returns a string that tells the user where the results were saved or if there was an error
        overallavgtxt.setFont(new java.awt.Font("Segoe UI", 1, 12));
        overallavgtxt.setText(String.valueOf(Grades.getOverallGrade()));
        gpatxt.setText(String.valueOf(Grades.getGPA(Grades.getLetterGrade(Grades.getOverallGrade()))));
        quizavgtxt.setText(String.valueOf(Grades.getQuizAverage()));
        testavgtxt.setText(String.valueOf(Grades.getTestAverage()));
        lettergradetxt.setFont(new java.awt.Font("Segoe UI", 1, 12));
        lettergradetxt.setText(String.valueOf(Grades.getLetterGrade(Grades.getOverallGrade())));

        closebutton.setText("Close"); //This button closes the window
        closebutton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                closebuttonClicked();
            }
        });
        closebutton.addKeyListener(new KeyAdapter() { //If the user presses enter or space, the window will close
            public void keyPressed(KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_SPACE) {
                    closebuttonClicked();
                }
            }
        });
        //Setting up the window layout
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(Alignment.LEADING)
            .addComponent(resultslabel, DEFAULT_SIZE, DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(Alignment.LEADING)
                            .addComponent(filesavedhere)
                            .addComponent(college)
                            .addComponent(withhonors)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(Alignment.LEADING)
                                    .addComponent(overallavg)
                                    .addComponent(gpa)
                                    .addComponent(quizavg)
                                    .addComponent(testavg)
                                    .addComponent(lettergrade))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(Alignment.LEADING)
                                    .addComponent(lettergradetxt)
                                    .addComponent(testavgtxt)
                                    .addComponent(quizavgtxt)
                                    .addComponent(gpatxt)
                                    .addComponent(overallavgtxt)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(closebutton, PREFERRED_SIZE, 110, PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(resultslabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(Alignment.BASELINE)
                    .addComponent(testavg)
                    .addComponent(testavgtxt))
                .addPreferredGap(ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(Alignment.BASELINE)
                    .addComponent(quizavg)
                    .addComponent(quizavgtxt))
                .addPreferredGap(ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(Alignment.BASELINE)
                    .addComponent(gpa)
                    .addComponent(gpatxt))
                .addPreferredGap(ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(Alignment.BASELINE)
                    .addComponent(overallavg)
                    .addComponent(overallavgtxt))
                .addPreferredGap(ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(Alignment.BASELINE)
                    .addComponent(lettergrade)
                    .addComponent(lettergradetxt))
                .addPreferredGap(ComponentPlacement.UNRELATED)
                .addComponent(withhonors)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(college)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(filesavedhere)
                .addGap(18, 18, 18)
                .addComponent(closebutton)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        pack();
    }

    private void closebuttonClicked() { //This method closes the window
        resultslabel.setText("Goodbye!");
        resultslabel.paintImmediately(resultslabel.getVisibleRect()); //Since we are causing the Event Dispatch Thread to sleep, we need to repaint right away
        try {Thread.sleep(1500);}
        catch (InterruptedException e) {} //Nothing should interrupt EDTs sleep (and if it does, we don't care) but Java doesn't like uncaught exceptions
        System.exit(0); //The end of an era. Phew! What a ride!
    }
    //Create variables for the GUI
    private final JLabel college;
    private final JLabel filesavedhere;
    private final JLabel gpa;
    private final JLabel gpatxt;
    private final JButton closebutton;
    private final JLabel resultslabel;
    private final JLabel quizavg;
    private final JLabel lettergrade;
    private final JLabel lettergradetxt;
    private final JLabel overallavg;
    private final JLabel overallavgtxt;
    private final JLabel quizavgtxt;
    private final JLabel testavg;
    private final JLabel testavgtxt;
    private final JLabel withhonors;
}