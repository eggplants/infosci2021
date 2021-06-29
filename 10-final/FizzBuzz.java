/**
 * kadai 10-ex3
 *
 * @author haruna wataru
 * @version 2021-06-29
 */
class FizzBuzz {
	public static void main(String args[]) {
		if (args.length != 1) {
			System.err.println("Wrong Arguments");
			System.exit(1);
		}
		int Times = Integer.parseInt(args[0]);
		for (int i = 1; i <= Times; i++) {
			System.out.print((i % 3 > 0 ? "" : "Fizz") + (i % 5 > 0 ? i % 3 > 0 ? i : "" : "Buzz") + " ");
		}
		System.out.println();
	}
}
