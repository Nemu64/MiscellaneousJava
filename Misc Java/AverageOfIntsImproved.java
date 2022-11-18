import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class AverageOfInts {
	public static Scanner keyboard = new Scanner(System.in);
	public static Integer[] nums = {};
	public static ArrayList<Integer> numberarray = new ArrayList<>(Arrays.asList(nums));
	public static String lastFunctionCalled = "main()";
	public static void main(String[] args) {
		try {
			getNumbers();
		}
		catch(Exception e) {
			System.out.print("\nSomething terrible happened at " + lastFunctionCalled + "!\n>> " + e + " <<\nTrying to recover...\n\nCurrent numbers: " + Arrays.toString(nums));
			getNumbers();
		}
	}
	public static void getNumbers() {
		lastFunctionCalled = "getNumbers()";
		System.out.print("\n\nEnter a number, type \"delete\" to delete a number, or type \"done\" to calculate the average: ");
		String numtoadd = keyboard.next();
        Integer intnta = Integer.parseInt(numtoadd);
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
		}
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
        Integer intnta = Integer.parseInt(numtoadd);
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

}