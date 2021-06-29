/**
 * kadai mid-ex
 *
 * @author haruna wataru
 * @version 2021-06-01
 */
class RevChar {
	public static void main(String args[]) {
		if (args.length != 1) {
			System.err.println("Wrong Arguments");
			System.exit(1);
		}
		String S = args[0];
		int lenStr = S.length();
		for (int i = 1; i <= lenStr; i++) {
			System.out.print(S.charAt​(lenStr - i));
			if (i % 2 == 0)
				System.out.println();
		}
		if (lenStr % 2 == 1)
			System.out.println();
	}
}
