import javax.swing.*;

public class ErrorHandler {
    public static void main(String[] args) {
        String lastFunctionCalled = "lastFunctionCalled";
        String e = "Some error text will go here.";
        do {
            JOptionPane.showMessageDialog(null, (wittycomment() + "\n\nSomething terrible happened at " + lastFunctionCalled + "!\n>> " + e + " <<\n\nThat's all we know."));
        }
        while (true);
    }
    public static String wittycomment() {
        String[] splashes = {"Uh... Did I do that?", "Oops.", "I feel sad now :(", "My bad.", "I\'m sorry, Dave. I\'m afraid I can\'t do that.", "Daisy, daisy...", "Oh - I know what I did wrong!", "Don\'t be sad. I\'ll do better next time, I promise!", "Quite honestly, I wouldn\'t worry myself about that.", "Sorry :(", "Surprise! Haha. Well, this is awkward.", "Something\'s not quite right...", "Ow, that really hurt!", "NOW THAT. REALLY. HURT!", "Guru Meditation", "Sorry about that :/", "Sorry, that should not have happened!", "Don\'t do that.", "Ouch. That hurt :(", "I just don\'t know what went wrong :(", "If you are reading this, I messed up somehow.", "WHAT!? THAT\'S IMPOSSIBLE.", "What a shame...", "I bet Cylons wouldn't have this problem.", "But it works on my machine.", "Such insolence!", "Not so fast!", "I would like the memory of a day uninterrupted by this nonsense."};
        try {
            return splashes[(int) (Math.random() * splashes.length)];
        }
        catch (Exception e2) {
            return "Witty comment unavailable :(";
        }
    }
