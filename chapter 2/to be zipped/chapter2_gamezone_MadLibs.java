import java.util.Scanner;
public class chapter2_gamezone_MadLibs {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("First, enter a noun: ");
		String firstnoun = keyboard.next();
		System.out.print("Next, enter a animal: ");
		String animal = keyboard.next();
		System.out.print("Now another animal: ");
		String animal2 = keyboard.next();
		System.out.print("Finally, a verb ending in \"ed\": ");
		String verb = keyboard.next();
		System.out.print("All around the " + firstnoun + "\nThe " + animal + " " + verb + " the " + animal2 + "\nThe " + animal + " thought it was all in fun\nPop goes the " + animal2);
		keyboard.close();
	}

}
