/**
 * kadai 05-04
 *
 * @author haruna wataru
 * @version 2021-05-24
 */
class ArgsCheck {
	private static boolean check(int n) {
		return 100 <= n && n <= 60000;
	}

	public static void main(String args[]) {
		if (args.length != 1) {
			System.err.println("Wrong Arguments");
			System.exit(1);
		}
		int N = Integer.parseInt(args[0]);
		String res = check(N) ? "OK" : "NG";
		System.out.println(N + " is " + res + "!");
	}
}
