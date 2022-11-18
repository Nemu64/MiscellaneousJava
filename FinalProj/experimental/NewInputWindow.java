import javax.swing.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import static java.lang.Float.parseFloat;
import static javax.swing.GroupLayout.*;

public class NewInputWindow extends JFrame { //We need to extend JFrame so that the window can be minimized

    public NewInputWindow() {
        super();
        initComponents();
    }
    private void initComponents() {
        // Create components and assign them to variables
        quiz2label = new JLabel();
        quiz3label = new JLabel();
        test1 = new JTextField();
        test2 = new JTextField();
        test3 = new JTextField();
        quiz4label = new JLabel();
        quiz1 = new JTextField();
        quiz2 = new JTextField();
        quiz3 = new JTextField();
        quiz4 = new JTextField();
        namelabel = new JLabel();
        name = new JTextField();
        hwlabel = new JLabel();
        okbutton = new JButton();
        savebutton = new JButton();
        clearbutton = new JButton();
        changethemebutton = new JButton();
        hwgrade = new JTextField();
        openbutton = new JButton();
        attendancelabel = new JLabel();
        collegelabel = new JLabel();
        attendance = new JTextField();
        collegename = new JTextField();
        test1label = new JLabel();
        test2label = new JLabel();
        test3label = new JLabel();
        test4label = new JLabel();
        test4 = new JTextField();
        quiz1label = new JLabel();
        statusbar = new JLabel();
        easteregg = new JTextField();
        jSeparator1 = new JSeparator();

        //Here we set various properties of the window and add event listeners to the buttons
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE); //We don't want the window to close unless the user confirms
        setTitle("Grade Calculator");
        setName("dialog");
        setResizable(false);
        addMouseListener(new MouseAdapter() { //When the mouse is not over an element, hint text is displayed
            public void mouseEntered(MouseEvent evt) {
                setStatus("Hover an item for details");
            }
        });

        quiz2label.setText("Quiz 2 Score");
        quiz3label.setText("Quiz 3 Score");
        test1.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) { //Hint what data to enter
                setStatus("Enter your score for Test 1 here. (0-100)");
            }
        });
        test1.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent evt) { //If the user tabs to the field, we'll still display the hint
                setStatus("Enter your score for Test 1 here. (0-100)");
            }
        });

        test2.addMouseListener(new MouseAdapter() { //Hint what data to enter
            public void mouseEntered(MouseEvent evt) {
                setStatus("Enter your score for Test 2 here. (0-100)");
            }
        });
        test2.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent evt) { //If the user tabs to the field, we'll still display the hint
                setStatus("Enter your score for Test 2 here. (0-100)");
            }
        });

        test3.addMouseListener(new MouseAdapter() { //Hint what data to enter
            public void mouseEntered(MouseEvent evt) {
                setStatus("Enter your score for Test 3 here. (0-100)");
            }
        });
        test3.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent evt) { //If the user tabs to the field, we'll still display the hint
                setStatus("Enter your score for Test 3 here. (0-100)");
            }
        });

        quiz4label.setText("Quiz 4 Score");

        quiz1.addMouseListener(new MouseAdapter() { //Hint what data to enter
            public void mouseEntered(MouseEvent evt) {
                setStatus("Enter your score for Quiz 1 here. (0-100)");
            }
        });
        quiz1.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent evt) { //If the user tabs to the field, we'll still display the hint
                setStatus("Enter your score for Quiz 1 here. (0-100)");
            }
        });

        quiz2.addMouseListener(new MouseAdapter() { //Hint what data to enter
            public void mouseEntered(MouseEvent evt) {
                setStatus("Enter your score for Quiz 2 here. (0-100)");
            }
        });
        quiz2.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent evt) { //If the user tabs to the field, we'll still display the hint
                setStatus("Enter your score for Quiz 2 here. (0-100)");
            }
        });

        quiz3.addMouseListener(new MouseAdapter() { //Hint what data to enter
            public void mouseEntered(MouseEvent evt) {
                setStatus("Enter your score for Quiz 3 here. (0-100)");
            }
        });
        quiz3.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent evt) { //If the user tabs to the field, we'll still display the hint
                setStatus("Enter your score for Quiz 3 here. (0-100)");
            }
        });

        quiz4.addMouseListener(new MouseAdapter() { //Hint what data to enter
            public void mouseEntered(MouseEvent evt) {
                setStatus("Enter your score for Quiz 4 here. (0-100)");
            }
        });
        quiz4.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent evt) { //If the user tabs to the field, we'll still display the hint
                setStatus("Enter your score for Quiz 4 here. (0-100)");
            }
        });

        namelabel.setText("Name: ");
        name.setText(System.getProperty("user.name")); //We'll try to guess the name based on the OS's username
        name.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                setStatus(nameboxhelptext);  //Hint what data to enter
            }
        });
        name.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                nameboxhelptext = "Enter your full name here."; //If the user corrects the name, we'll change the hint text
                setStatus(nameboxhelptext);
            }
        });
        name.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent evt) { //If the user tabs to the field, we'll still display the hint
                setStatus(nameboxhelptext);
            }
        });

        hwlabel.setText("HW Grade");

        hwgrade.addMouseListener(new MouseAdapter() { //Hint what data to enter
            public void mouseEntered(MouseEvent evt) {
                setStatus("Enter your final homework grade here. (0-100)");
            }
        });
        hwgrade.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent evt) { //If the user tabs to the field, we'll still display the hint
                setStatus("Enter your final homework grade here. (0-100)");
            }
        });

        okbutton.setText("OK");
        okbutton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                verifyAndPassData(false);
            } //When the user clicks OK, we'll verify the data and pass it to the is correct window
            public void mouseEntered(MouseEvent evt) {
                setStatus("Click this button to continue.");
            } //Hint what the button does
        });
        okbutton.addKeyListener(new KeyAdapter() { //If the user presses enter or space, we'll do the same thing as clicking OK
            public void keyPressed(KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_SPACE) {
                    verifyAndPassData(false);
                }
            }
        });
        okbutton.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent evt) { //If the user tabs to the button, we'll still display the hint
                setStatus("Click this button to continue.");
            }
        });
        openbutton.setText("Open..."); //This button will open a file chooser to load a file
        openbutton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                setStatus("Waiting for file...");
                Grades.readFile(dialog, Grades.pickFile(dialog, 'o'));
            }
            public void mouseEntered(MouseEvent evt) {  //Hint what the button does
                setStatus("Click this button to open a student information file.");
            }
        });
        openbutton.addKeyListener(new KeyAdapter() { //If the user presses enter or space, we'll do the same thing as clicking open
            public void keyPressed(KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_SPACE) {
                    setStatus("Waiting for file...");
                    Grades.readFile(dialog, Grades.pickFile(dialog, 'o'));
                }
            }
        });
        openbutton.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent evt) { //If the user tabs to the button, we'll still display the hint
                setStatus("Click this button to open a student information file.");
            }
        });
        savebutton.setText("Save..."); //This button will open a file chooser to select a save path
        savebutton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                setStatus("Waiting for save path...");
                verifyAndPassData(true); //Since we're saving, we only need to check if all fields are filled out
            }
            public void mouseEntered(MouseEvent evt) {
                setStatus("Click this button to save a student information file."); //Hint what the button does
            }
        });
        savebutton.addKeyListener(new KeyAdapter() { //If the user presses enter or space, we'll do the same thing as clicking save
            public void keyPressed(KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_SPACE) {
                    setStatus("Waiting for save path...");
                    verifyAndPassData(true);
                }
            }
        });
        savebutton.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent evt) { //If the user tabs to the button, we'll still display the hint
                setStatus("Click this button to save a student information file.");
            }
        });
        clearbutton.setText("Clear"); //This button will clear all the data fields
        clearbutton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                setStatus("Waiting for user confirmation...");
                clearFields();
            }
            public void mouseEntered(MouseEvent evt) {
                setStatus("Click this button to clear all fields."); //Hint what the button does
            }
        });
        clearbutton.addKeyListener(new KeyAdapter() { //If the user presses enter or space, we'll do the same thing as clicking clear
            public void keyPressed(KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_SPACE) {
                    setStatus("Waiting for user confirmation...");
                    clearFields();
                }
            }
        });
        clearbutton.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent evt) { //If the user tabs to the button, we'll still display the hint
                setStatus("Click this button to clear all fields.");
            }
        });
        changethemebutton.setText("\uD83D\uDDD7"); //This button will change the theme. Its text is a unicode character that looks like two overlapping windows
        changethemebutton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                setStatus("Changing theme...");
                changeTheme();
            }
            public void mouseEntered(MouseEvent evt) {
                setStatus(themestatus);
            } //Hint what the button does
        });
        changethemebutton.addKeyListener(new KeyAdapter() { //If the user presses enter or space, we'll do the same thing as clicking change theme
            public void keyPressed(KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_SPACE) {
                    setStatus("Changing theme...");
                    changeTheme();
                }
            }
        });
        changethemebutton.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent evt) { //If the user tabs to the button, we'll still display the hint
                setStatus(themestatus);
            }
        });

        attendancelabel.setText("Attendance");
        collegelabel.setText("The college I want to attend is: ");

        attendance.addMouseListener(new MouseAdapter() { //Hint what data to enter
            public void mouseEntered(MouseEvent evt) {
                setStatus("Enter your final attendance grade here. (0-100)");
            }
        });
        attendance.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent evt) { //If the user tabs to the field, we'll still display the hint
                setStatus("Enter your final attendance grade here. (0-100)");
            }
        });

        collegename.addMouseListener(new MouseAdapter() { //Hint what data to enter
            public void mouseEntered(MouseEvent evt) {
                setStatus("Enter the college you want to attend here.");
            }
        });
        collegename.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent evt) { //If the user tabs to the field, we'll still display the hint
                setStatus("Enter the college you want to attend here.");
            }
        });

        test1label.setText("Test 1 Score");
        test2label.setText("Test 2 Score");
        test3label.setText("Test 3 Score");
        test4label.setText("Test 4 Score");

        test4.addMouseListener(new MouseAdapter() { //Hint what data to enter
            public void mouseEntered(MouseEvent evt) {
                setStatus("Enter your score for Test 4 here. (0-100)");
            }
        });
        test4.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent evt) { //If the user tabs to the field, we'll still display the hint
                setStatus("Enter your score for Test 4 here. (0-100)");
            }
        });
        quiz1label.setText("Quiz 1 Score");
        easteregg.addKeyListener(new KeyAdapter() { //All the best programs have easter eggs
            public void keyTyped(KeyEvent evt) { //If the user types "Java", they get a special message
                if (easteregg.getText().equalsIgnoreCase("Jav") && evt.getKeyChar() == 'a') { //We want the user to see the message as soon as they type "Java", so we check if the text is "Jav" and the key is "a"
                    try {Runtime.getRuntime().exec("powershell.exe -c (New-Object Media.SoundPlayer \"C:\\Windows\\Media\\tada.wav\").PlaySync();");} //We'll try to play the tada sound. This will only work on Windows
                    catch (java.io.IOException e) {}
                    setStatus("Hello from the developer!");
                    JOptionPane.showMessageDialog(dialog, "<html>Hello from the developer!<br>Made with <font color=\"red\" size=\"+1\">♥</font> in Java</html>", "A secret is revealed!", JOptionPane.INFORMATION_MESSAGE);
                    dialog.remove(easteregg); //Easter eggs are only fun once. We'll remove the text field to make tabbing through the program easier
                }
            }
        });
        easteregg.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent evt) { //We'll hint how to get the easter egg
                setStatus("What's another name for coffee? :)");
            }
        });
        statusbar.setText("Watch here for important information"); //This will likely get overwritten right away, but it may get the user's attention
        statusbar.setToolTipText("Watch here for important information");
        //We need to set up the window layout
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(namelabel)
                .addGap(12, 12, 12)
                .addComponent(name, PREFERRED_SIZE, 113, PREFERRED_SIZE)
                .addComponent(easteregg, PREFERRED_SIZE, 0, PREFERRED_SIZE)) //This is a hidden text field that will be used for an easter egg
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(collegelabel)
                .addGap(6, 6, 6)
                .addComponent(collegename, PREFERRED_SIZE, 145, PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(test1label)
                .addGap(6, 6, 6)
                .addComponent(test1, PREFERRED_SIZE, 75, PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(quiz1label)
                .addGap(6, 6, 6)
                .addComponent(quiz1, PREFERRED_SIZE, 75, PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(test2label)
                .addGap(6, 6, 6)
                .addComponent(test2, PREFERRED_SIZE, 75, PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(quiz2label)
                .addGap(6, 6, 6)
                .addComponent(quiz2, PREFERRED_SIZE, 75, PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(test3label)
                .addGap(6, 6, 6)
                .addComponent(test3, PREFERRED_SIZE, 75, PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(quiz3label)
                .addGap(6, 6, 6)
                .addComponent(quiz3, PREFERRED_SIZE, 75, PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(okbutton)
                    .addGap(6, 6, 6)
                    .addComponent(clearbutton)
                .addGap(6, 6, 6)
                .addComponent(openbutton)
                    .addGap(6, 6, 6)
                    .addComponent(savebutton)
                    .addGap(6, 6, 6)
                    .addComponent(changethemebutton))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(statusbar))
            .addComponent(jSeparator1, PREFERRED_SIZE, 350, PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(Alignment.LEADING)
                    .addGroup(Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(test4label)
                        .addGap(6, 6, 6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(hwlabel)
                        .addGap(14, 14, 14)))
                .addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
                    .addComponent(hwgrade, DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(test4))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(quiz4label)
                        .addGap(6, 6, 6)
                        .addComponent(quiz4, PREFERRED_SIZE, 75, PREFERRED_SIZE))
                    .addGroup(Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(attendancelabel)
                        .addGap(10, 10, 10)
                        .addComponent(attendance, PREFERRED_SIZE, 75, PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(namelabel))
                    .addComponent(name, PREFERRED_SIZE, DEFAULT_SIZE, PREFERRED_SIZE)
                    .addComponent(easteregg, PREFERRED_SIZE, 0, PREFERRED_SIZE)) //Still hidden
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(collegelabel))
                    .addComponent(collegename, PREFERRED_SIZE, DEFAULT_SIZE, PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(Alignment.LEADING)
                    .addComponent(test1, PREFERRED_SIZE, DEFAULT_SIZE, PREFERRED_SIZE)
                    .addComponent(quiz1, PREFERRED_SIZE, DEFAULT_SIZE, PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(Alignment.LEADING)
                            .addComponent(test1label)
                            .addComponent(quiz1label))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(Alignment.LEADING)
                    .addComponent(test2, PREFERRED_SIZE, DEFAULT_SIZE, PREFERRED_SIZE)
                    .addComponent(quiz2, PREFERRED_SIZE, DEFAULT_SIZE, PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(Alignment.LEADING)
                            .addComponent(test2label)
                            .addComponent(quiz2label))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(Alignment.LEADING)
                    .addComponent(test3, PREFERRED_SIZE, DEFAULT_SIZE, PREFERRED_SIZE)
                    .addComponent(quiz3, PREFERRED_SIZE, DEFAULT_SIZE, PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(Alignment.LEADING)
                            .addComponent(test3label)
                            .addComponent(quiz3label))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(Alignment.LEADING)
                    .addComponent(test4, PREFERRED_SIZE, DEFAULT_SIZE, PREFERRED_SIZE)
                    .addComponent(quiz4, PREFERRED_SIZE, DEFAULT_SIZE, PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(Alignment.LEADING)
                            .addComponent(test4label)
                            .addComponent(quiz4label))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(Alignment.LEADING)
                    .addComponent(attendance, PREFERRED_SIZE, DEFAULT_SIZE, PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(Alignment.BASELINE)
                                .addComponent(hwlabel)
                                .addComponent(hwgrade, PREFERRED_SIZE, DEFAULT_SIZE, PREFERRED_SIZE))
                            .addComponent(attendancelabel))))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(Alignment.LEADING)
                    .addComponent(okbutton)
                        .addComponent(clearbutton)
                    .addComponent(openbutton)
                    .addComponent(savebutton)
                    .addComponent(changethemebutton))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(Alignment.LEADING)
                    .addComponent(statusbar)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jSeparator1, PREFERRED_SIZE, 10, PREFERRED_SIZE))))
        );
        pack();
    }
    static NewInputWindow dialog; //Since we'll be passing the window around, we need to make it static
    static JFileChooser chooser; //Since the chooser can be used multiple times, we may as well make it static
    public static void main(String[] args) {
        try { //Try to set the look and feel to the system's look and feel
            if (System.getProperty("os.name").contains("Windows")) {
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            }
            else if (System.getProperty("os.name").contains("Linux")) {
                try { //Linux has far too many look and feels to try them all, so we'll just try the GTK one
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
                }
                catch (Exception e) { //If that fails, we'll just use Motif
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
                }
            }
            else if (System.getProperty("os.name").contains("Mac")) {
                UIManager.setLookAndFeel("com.apple.laf.AquaLookAndFeel");
            }
            else { //If we can't figure out what OS we're on, we'll just use the default look and feel
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            }
        }
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            errorOccurred("cantfindtheme"); //If we can't find a suitable theme, let the user know we're falling back to the default
        }
        java.awt.EventQueue.invokeLater(() -> { //We have to use the EventQueue to make sure the window is created on the Event Dispatch Thread
            dialog = new NewInputWindow();
            chooser = new JFileChooser(); //Preemptively create the file chooser
            chooser.setCurrentDirectory(new File("./")); //We want to start in the current directory
            chooser.setFileFilter(new javax.swing.filechooser.FileFilter() {
                @Override //We only want to show .txt files
                public boolean accept(File f) {
                    return f.getName().toLowerCase().endsWith(".txt") || f.isDirectory();
                }
                @Override //We better be explicit or the compiler will complain
                public String getDescription() {
                    return "TXT files";
                }
                //Probably not necessary, but we'll hint to users that we only want .txt files
            });
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override //Java should be able to figure out that we're overriding the windowClosing method, but we'll be explicit
                public void windowClosing(java.awt.event.WindowEvent e) {
                    confirmExit(); //Confirm that the user actually wants to exit
                }
            });
            dialog.setVisible(true); //Here is where it all begins!
            Grades.center(dialog); //The window has to be visible before we can center it
        });
    }
    public static void confirmExit() { //Prevent accidental closing
        if (JOptionPane.showConfirmDialog(dialog, "Are you sure you want to exit?","Confirm exit",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) System.exit(0);
    }
    public void clearFields() { //Request confirmation so that clueless users don't accidentally clear their data
        if (JOptionPane.showConfirmDialog(dialog, "<html>Are you sure you want to clear all fields?<br><font color=\"red\">This action cannot be undone!</font></html>","Confirm clear",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) { //We'll use HTML to make the warning red
            name.setText("");
            collegename.setText("");
            test1.setText("");
            test2.setText("");
            test3.setText("");
            test4.setText("");
            quiz1.setText("");
            quiz2.setText("");
            quiz3.setText("");
            quiz4.setText("");
            attendance.setText("");
            hwgrade.setText("");
            nameboxhelptext = "Enter your full name here."; //Since we may have wiped out the autofilled name, we need to change the help text
            setStatus("Cleared all fields.");
        }
    }
    static int i = 0; //We need this to act as an index for the themes array
    public void changeTheme() {
        try {
            UIManager.LookAndFeelInfo[] themes = UIManager.getInstalledLookAndFeels();
            if (themes.length <= 1) { //This should never happen, but just in case...
            changethemebutton.setEnabled(false);
                changethemebutton.removeMouseListener(changethemebutton.getMouseListeners()[0]);
                themestatus = "No alternate themes found.";
                setStatus(themestatus);
                changethemebutton.setToolTipText("No alternative themes found");
            }
            else {
                UIManager.setLookAndFeel(themes[i].getClassName());
                SwingUtilities.updateComponentTreeUI(dialog); //We have to tell Swing to update the UI
                dialog.pack(); //This is needed to resize the window to fit the new theme
                setStatus("Theme changed to " + themes[i].getName());
                i++;
                if (i == themes.length) i = 0; //Loop back to the first theme
            }
        }
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            errorOccurred("cantapplytheme"); //If we can't apply the theme, let the user know
        }
    }
    public void setStatus(String status) { //The status bar lets the user know what's going on
        statusbar.setText(status);
    }
    public void verifyAndPassData(boolean justverify) { //Verify that the necessary fields are filled out and pass the data to the is correct window
        if (name.getText().isBlank() || collegename.getText().isBlank()) { //If the name or college name fields are blank, we can't continue
            if (justverify) errorOccurred("cantsave"); //We determine how to handle the error based on whether we're just verifying
            else errorOccurred("missingdata");
            return;
        }
        Grades.studentName = name.getText();
        Grades.collegeName = collegename.getText();
        try { //All of these must be numbers, so we'll try to parse them
            Grades.test1 = parseFloat(test1.getText());
            Grades.test2 = parseFloat(test2.getText());
            Grades.test3 = parseFloat(test3.getText());
            Grades.test4 = parseFloat(test4.getText());
            Grades.quiz1 = parseFloat(quiz1.getText());
            Grades.quiz2 = parseFloat(quiz2.getText());
            Grades.quiz3 = parseFloat(quiz3.getText());
            Grades.quiz4 = parseFloat(quiz4.getText());
            Grades.hwGrade = parseFloat(hwgrade.getText());
            Grades.attendanceGrade = parseFloat(attendance.getText());
        }
        catch (NumberFormatException e) { //If we can't parse them, we'll let the user know
            if (justverify) {
                errorOccurred("cantsave");
                return;
            }
            else errorOccurred("missingdata");
            return;
        }
        if (justverify) { //If we're just writing a file, we don't need to open the is correct window
            if (Grades.writeFile(Grades.pickFile(dialog, 's'))) {
                JOptionPane.showMessageDialog(dialog, "Successfully wrote student information file!", "File saved", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else {
            this.setVisible(false); //We are not disposing the main window in case the user clicks no on the is correct window
            JFrame iscorrect = new NewIsCorrectWindow(dialog); //We need to store the window as a variable, so we can center it
            Grades.center(iscorrect);
            iscorrect.setVisible(true); //We'll keep the window hidden until it's been centered, otherwise it will jump around
        }
    }
    public static void errorOccurred(String error) { //This method is called when an error occurs
        String message = "No information for this error"; //If an error that isn't accounted for occurs, this will be the message
        switch (error) {
            case "filereaderror" -> {
                message = "This does not appear to be a valid student information file.";
            }
            case "missingdata" -> {
                message = "Something is not right.\nCheck to make sure you filled in all data fields with the proper data type.";
            }
            case "cantsave" -> {
                message = "Please fill out all fields first.";
            }
            case "saveerror" -> {
                message = "Failed to save the student information file!";
            }
            case "cantfindtheme" -> {
                message = "Failed to find a suitable theme for your operating system.\nFalling back to default theme.";
            }
            case "cantapplytheme" -> {
                message = "An error occurred while applying the theme.";
            }
        }
        JOptionPane.showMessageDialog(dialog, message, "An error occurred", JOptionPane.ERROR_MESSAGE);
    }
    //Lots of variable declarations
    private String nameboxhelptext = "We autofilled your name. If this is not correct, please fix it.";
    private String themestatus = "Click this button to change the theme.";
    private JTextField attendance;
    private JLabel attendancelabel;
    private JButton openbutton;
    private JButton savebutton;
    private JButton clearbutton;
    private JButton changethemebutton;
    private JLabel collegelabel;
    private JTextField collegename;
    private JTextField hwgrade;
    private JLabel hwlabel;
    private JSeparator jSeparator1;
    static JTextField name;
    private JLabel namelabel;
    private JButton okbutton;
    private JTextField quiz1;
    private JLabel quiz1label;
    private JTextField quiz2;
    private JLabel quiz2label;
    private JTextField quiz3;
    private JLabel quiz3label;
    private JTextField quiz4;
    private JLabel quiz4label;
    private JLabel statusbar;
    private JTextField test1;
    private JLabel test1label;
    private JTextField test2;
    private JLabel test2label;
    private JTextField test3;
    private JLabel test3label;
    private JTextField test4;
    private JLabel test4label;
    private JTextField easteregg;
}