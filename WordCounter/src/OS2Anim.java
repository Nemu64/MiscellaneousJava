public class OS2Anim {
    public static void main(String[] args) {
        String[] AnimStates = {"/----------\\", "-/--------\\-", "--/------\\--", "---/----\\---", "----/--\\----",
                "-----/\\-----", "-----\\/-----", "----\\--/----", "---\\----/---", "--\\------/--", "-\\--------/-",
                "\\----------/"};
        for (int i = 0; true; i++) {
            System.out.print(AnimStates[i] + "\r");
            System.out.flush();
            if (i == AnimStates.length - 1) i = 0;
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}