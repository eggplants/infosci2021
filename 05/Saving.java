/**
 * kadai 05-05
 *
 * @author haruna wataru
 * @version 2021-05-24
 */
class Saving {
	static double calculate(long p, double i, int t) {
		for (int j = 0; j < t; j++) {
			p *= 1 + i;
		}
		return p;
	}

	public static void main(String args[]) {
		if (args.length != 3) {
			System.err.println("Wrong Arguments: expected 3, but got " + args.length);
			System.exit(1);
		}
		long principal = Long.parseLong(args[0]);
		double rate = Double.parseDouble(args[1]);
		int term = Integer.parseInt(args[2]);
		double saving = calculate(principal, rate, term);
		System.out.println("Principal		: " + principal);
		System.out.printf("interest rate	: %.4f\n", rate);
		System.out.println("Term			: " + term);
		System.out.printf("Now Saving		: %d\n", (int) saving);
	}
}
