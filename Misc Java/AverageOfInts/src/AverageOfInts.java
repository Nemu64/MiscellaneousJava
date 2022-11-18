import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class AverageOfInts {
	Thread.setDefaultUncaughtExceptionHandler(
			new DefaultExceptionHandler(ErrorHandler));
	public static Scanner keyboard = new Scanner(System.in);
	public static int[] nums = {};
	public static ArrayList<Integer> numberarray = new ArrayList<>(Arrays.asList(nums));
	public static String lastFunctionCalled = "main()";
	public static void main(String[] args) {

			getNumbers();
		/*
		catch(Exception e) {
			System.out.print("\nSomething terrible happened at " + lastFunctionCalled + "!\n>> " + e + " <<\nTrying to recover...\n\nCurrent numbers: " + Arrays.toString(nums));
			main(null);
		}*/
	}
	public static void getNumbers() {
		lastFunctionCalled = "getNumbers()";
		System.out.print("\n\nEnter a number, type \"delete\" to delete a number, or type \"done\" to calculate the average: ");
		String numtoadd = keyboard.nextLine();
		System.out.print(numtoadd);
        int intnta = Integer.parseInteger(numtoadd);
		if (numtoadd.toLowerCase().contentEquals("done")) {
			getAverage();
			System.exit(0);
		}
		else if (numtoadd.toLowerCase().contentEquals("delete") && nums.length > 0) {
			deleteNumber();
		}
		else if (numtoadd.toLowerCase().contentEquals("delete")) {
			System.out.print("The number list is blank, so you can't delete anything.");
			getNumbers();
		}/* 
		else if (((double)intnta).isNaN()) {
			System.out.print("Hello world!");
		}/*
		else if (numtoadd.contains(",")) {
			int[] multinumbers = numtoadd.split(",");
			for (int x = 0; x < multinumbers.length; x++) {
				if (numberarray.contains(intnta)) {
					System.out.print("That number is already in the list. Do you want to add it again? (y/n) ");
					if (keyboard.next().toLowerCase().contentEquals("y")) {
						numberarray.add(intnta);
						nums = numberarray.toArray(nums);
					}
				}
				else {
					numberarray.add(intnta);
					nums = numberarray.toArray(nums);
				}
			}
		}*/
		}
		else {
			if (numberarray.contains(intnta)) {
				System.out.print("That number is already in the list. Do you want to add it again? (y/n) ");
				if (keyboard.next().toLowerCase().contentEquals("y")) {
					numberarray.add(intnta);
					nums = numberarray.toArray(nums);
				}
			}
			else {
				numberarray.add(intnta);
				nums = numberarray.toArray(nums);
			}
			System.out.print("\nCurrent numbers: " + Arrays.toString(nums));
			getNumbers();
		}
	}

	public static int sumNumbers() {
		lastFunctionCalled = "sumNumbers()";
		int finaltotal = 0;
		for (Integer num : nums) finaltotal += num;
		return finaltotal;
	}

	public static void deleteNumber() {
		lastFunctionCalled = "deleteNumber()";
		if (nums.length == 0) {
			System.out.print("\nThe number list is blank, so you can't delete anything.");
			getNumbers();
		}
		System.out.print("\nCurrent numbers: " + Arrays.toString(nums) + "\nType the number you want to delete, or type \"done\" to exit delete mode: ");
		String numtoadd = keyboard.next();
		int intnta = Integer.parseInteger(numtoadd);
		if (numtoadd.toLowerCase().contentEquals("done")) {
			getNumbers();
		}
		else {
			if (numberarray.contains(intnta)) {
				numberarray.remove(intnta);
				nums = numberarray.toArray(nums);
				nums = Arrays.copyOf(nums, nums.length - 1);
				deleteNumber();
			}
			else {
				System.out.print("\nThat number is not in the list.\n");
				deleteNumber();
			}
		}
	}

	public static void getAverage() {
		lastFunctionCalled = "getAverage()";
		if (nums.length < 2) {
			System.out.print("You need at least 2 numbers to compute an average.");
			getNumbers();
		}
		else {
			System.out.print("The average of the number list is " + ((double)sumNumbers() / nums.length));
		}
	}
	public static void Errorhandler() {
		String lastFunctionCalled = "HI";
		String e = "Some error text will go here.";
		JOptionPane.showMessageDialog(null, (wittycomment() + "\n\nSomething terrible happened at " + lastFunctionCalled + "!\n>> " + e + " <<\n\nThat's all we know."));
	}
	public static String wittycomment() {
		String[] splashes = {"Uh... Did I do that?", "Oops.", "I feel sad now :(", "My bad.", "I\'m sorry, Dave. I\'m afraid I can\'t do that.", "Daisy, daisy...", "Oh - I know what I did wrong!", "Don\'t be sad. I\'ll do better next time, I promise!", "Quite honestly, I wouldn\'t worry myself about that.", "Sorry :(", "Surprise! Haha. Well, this is awkward.", "Something\'s not quite right...", "Ow, that really hurt!", "NOW THAT. REALLY. HURT!", "Guru Meditation", "Sorry about that :/", "Sorry, that should not have happened!", "Don\'t do that.", "Ouch. That hurt :(", "I just don\'t know what went wrong :(", "If you are reading this, I messed up somehow.", "WHAT!? THAT\'S IMPOSSIBLE.", "What a shame...", "I bet Cylons wouldn't have this problem.", "But it works on my machine.", "Such insolence!", "Not so fast!"};
		try {
			String wittycomment = splashes[(int) (Math.random() * splashes.length)];
			return wittycomment;
		}
		catch (Exception e2) {
			return "Witty comment unavailable :(";
		}
	}
}