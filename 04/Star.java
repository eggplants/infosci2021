/**
 * kadai 04-05
 *
 * @author haruna wataru
 * @version 2021-05-13
 */
class Star {
	private static void printStar(int n) {
		if (n > 0) {
			System.out.print("*");
			printStar(n - 1);
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
