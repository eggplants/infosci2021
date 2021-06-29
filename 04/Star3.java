/**
 * kadai 04-ex2
 *
 * @author haruna wataru
 * @version 2021-05-13
 */
class Star3 {
	private static void printStar(int n) {
		for (;;) {
			if (n < 1) {
				break;
			}
			System.out.print("*");
			n--;
		}
	}

	public static void main(String args[]) {
		if (args.length != 1) {
			System.err.println("Argument must be one!");
			System.exit(1);
		}
		int N = Integer.parseInt(args[0]);
		System.out.println("Input Number	: " + N);
		printStar(N);
		if (N > 0) {
			System.out.println("");
		}
	}
}
