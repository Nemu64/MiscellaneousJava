public class chapter2_prob4_QuartToGallons {

	public static void main(String[] args) {
		final int QUARTS_IN_GALLON = 4;
		int quartsneeded = 5154;
		System.out.print("For a job that requires " + quartsneeded + " quarts of paint, you would need " + (quartsneeded / QUARTS_IN_GALLON) + " gallon(s) and " + (quartsneeded % QUARTS_IN_GALLON) + " quart(s).");
	}
}
