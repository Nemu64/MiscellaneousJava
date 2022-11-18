import java.awt.Color;
import javax.swing.*;

import static javax.swing.GroupLayout.*;

public class NewIsCorrectWindow extends JFrame { //We need to extend JFrame so that the window can be minimized
    public NewIsCorrectWindow(JFrame myparent) {
        //Create components and assign them to variables
        dialog = myparent; //We need this to return to the main window if the user clicks the "No" button
        isOkLabel = new JLabel();
        yesButton = new JButton();
        noButton = new JButton();
        name = new JLabel();
        college = new JLabel();
        test1 = new JLabel();
        test2 = new JLabel();
        test3 = new JLabel();
        test4 = new JLabel();
        collegetext = new JLabel();
        nametext = new JLabel();
        test1text = new JLabel();
        test2text = new JLabel();
        test3text = new JLabel();
        test4text = new JLabel();
        quiz1 = new JLabel();
        quiz2 = new JLabel();
        quiz3 = new JLabel();
        quiz4 = new JLabel();
        hwgrade = new JLabel();
        attendance = new JLabel();
        attendancetext = new JLabel();
        hwgradetext = new JLabel();
        quiz4text = new JLabel();
        quiz3text = new JLabel();
        quiz2text = new JLabel();
        quiz1text = new JLabel();
        isOkLabel.setFont(new java.awt.Font("Segoe UI", 1, 24));
        isOkLabel.setHorizontalAlignment(SwingConstants.CENTER);
        isOkLabel.setText("Is this correct?");

        yesButton.setText("Yes"); //This shows the results window
        yesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sayOkAndShowNextWindow();
            }
        });
        yesButton.addKeyListener(new java.awt.event.KeyAdapter() { //If the user presses enter or space, we'll do the same thing as clicking yes
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER || evt.getKeyCode() == java.awt.event.KeyEvent.VK_SPACE) {
                    sayOkAndShowNextWindow();
                }
            }
        });

        noButton.setText("No"); //This returns to the main window
        noButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                noClicked();
            }
        });
        noButton.addKeyListener(new java.awt.event.KeyAdapter() { //If the user presses enter or space, we'll do the same thing as clicking no
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER || evt.getKeyCode() == java.awt.event.KeyEvent.VK_SPACE) {
                    noClicked();
                }
            }
        });
        this.addWindowListener(new java.awt.event.WindowAdapter() { //If the user clicks the X button, return to the main window
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                noClicked();
            }
        });
        //Here we set various properties of the window and add event listeners to the buttons
        name.setText("Name:");
        college.setText("College:");
        test1.setText("Test 1: ");
        test2.setText("Test 2: ");
        test3.setText("Test 3: ");
        test4.setText("Test 4: ");
        collegetext.setText(Grades.collegeName);
        nametext.setText(Grades.studentName);
        test1text.setText(String.valueOf(Grades.test1));
        test2text.setText(String.valueOf(Grades.test2));
        test3text.setText(String.valueOf(Grades.test3));
        test4text.setText(String.valueOf(Grades.test4));
        quiz1.setText("Quiz 1: ");
        quiz2.setText("Quiz 2: ");
        quiz3.setText("Quiz 3: ");
        quiz4.setText("Quiz 4: ");
        hwgrade.setText("HW Grade: ");
        attendance.setText("Attendance: ");
        attendancetext.setText(String.valueOf(Grades.attendanceGrade));
        hwgradetext.setText(String.valueOf(Grades.hwGrade));
        quiz4text.setText(String.valueOf(Grades.quiz4));
        quiz3text.setText(String.valueOf(Grades.quiz3));
        quiz2text.setText(String.valueOf(Grades.quiz2));
        quiz1text.setText(String.valueOf(Grades.quiz1));
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Check information");
        setResizable(false);
        //Setting up the window layout
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(isOkLabel, PREFERRED_SIZE, 350, PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(name)
                                                .addGap(18, 18, 18)
                                                .addComponent(nametext))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(college)
                                                .addGap(12, 12, 12)
                                                .addComponent(collegetext))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(test1)
                                                .addGap(18, 18, 18)
                                                .addComponent(test1text))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(test2)
                                                .addGap(18, 18, 18)
                                                .addComponent(test2text))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(test3)
                                                .addGap(18, 18, 18)
                                                .addComponent(test3text))
                                        .addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
                                                .addComponent(yesButton, Alignment.LEADING, DEFAULT_SIZE, DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(Alignment.LEADING, layout.createSequentialGroup()
                                                        .addComponent(test4)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(test4text))))
                                .addGroup(layout.createParallelGroup(Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addGroup(layout.createParallelGroup(Alignment.LEADING, false)
                                                        .addComponent(quiz1, DEFAULT_SIZE, DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(quiz2, DEFAULT_SIZE, DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(quiz3, DEFAULT_SIZE, DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(quiz4, DEFAULT_SIZE, DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(hwgrade, DEFAULT_SIZE, DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(attendance, DEFAULT_SIZE, DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(Alignment.LEADING)
                                                        .addComponent(quiz1text)
                                                        .addComponent(quiz2text)
                                                        .addComponent(quiz3text)
                                                        .addComponent(quiz4text)
                                                        .addComponent(hwgradetext)
                                                        .addComponent(attendancetext))
                                                .addContainerGap(DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(noButton, PREFERRED_SIZE, 98, PREFERRED_SIZE)
                                                .addGap(35, 35, 35))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(isOkLabel)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(Alignment.LEADING)
                                        .addComponent(name)
                                        .addGroup(layout.createParallelGroup(Alignment.BASELINE)
                                                .addComponent(nametext)
                                                .addComponent(quiz1)
                                                .addComponent(quiz1text)))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(Alignment.LEADING)
                                        .addComponent(college)
                                        .addComponent(collegetext)
                                        .addGroup(layout.createParallelGroup(Alignment.BASELINE)
                                                .addComponent(quiz2)
                                                .addComponent(quiz2text)))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(test1)
                                        .addComponent(test1text)
                                        .addComponent(quiz3)
                                        .addComponent(quiz3text))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(test2)
                                        .addComponent(test2text)
                                        .addComponent(quiz4)
                                        .addComponent(quiz4text))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(test3)
                                        .addComponent(test3text)
                                        .addComponent(hwgrade)
                                        .addComponent(hwgradetext))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(test4)
                                        .addComponent(test4text)
                                        .addComponent(attendance)
                                        .addComponent(attendancetext))
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(yesButton)
                                        .addComponent(noButton))
                                .addGap(13, 13, 13))
        );
        pack();
    }
    public void sayOkAndShowNextWindow() {
        isOkLabel.setText("OK, let's do it!!");
        isOkLabel.setForeground(new Color(0, 128, 0)); //Set the text to green
        isOkLabel.paintImmediately(isOkLabel.getVisibleRect()); //Since we are causing the Event Dispatch Thread to sleep, we need to repaint right away
        try {Thread.sleep(2000);} //Make sure the user sees the message
        catch (InterruptedException e) {} //Nothing should interrupt EDTs sleep (and if it does, we don't care) but Java doesn't like uncaught exceptions
        this.dispose(); //We don't need this window anymore
        JFrame results = new NewResultsWindow(); //We need to store the window as a variable, so we can center it
        Grades.center(results);
        results.setVisible(true); //We'll keep the window hidden until it's been centered, otherwise it will jump around
    }
    public void noClicked() { //If no is clicked, get rid of this window and go back to the main one
        this.dispose();
        dialog.setVisible(true);
    }
    //Create variables for the GUI
    private final JLabel attendancetext;
    private final JLabel college;
    private final JLabel collegetext;
    private final JLabel hwgradetext;
    private final JLabel isOkLabel;
    private final JLabel hwgrade;
    private final JLabel attendance;
    private final JLabel name;
    private final JLabel nametext;
    private final JButton noButton;
    private final JLabel quiz1;
    private final JLabel quiz1text;
    private final JLabel quiz2;
    private final JLabel quiz2text;
    private final JLabel quiz3;
    private final JLabel quiz3text;
    private final JLabel quiz4;
    private final JLabel quiz4text;
    private final JLabel test1;
    private final JLabel test1text;
    private final JLabel test2;
    private final JLabel test2text;
    private final JLabel test3;
    private final JLabel test3text;
    private final JLabel test4;
    private final JLabel test4text;
    private final JButton yesButton;
    private final JFrame dialog;
}