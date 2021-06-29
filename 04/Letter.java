/**
 * kadai 04-06
 *
 * @author haruna wataru
 * @version 2021-05-13
 */
class Letter {
	public static void main(String args[]) {
		if (args.length != 1) {
			System.err.println("Argument must be one!");
			System.exit(1);
		} else if (args[0].length() != 1) {
			System.err.println("Argument must be a character!");
			System.exit(1);
		}
		char C = args[0].charAt(0);
		System.out.println("Input a letter[A-E]	: " + C);
		switch (C) {
			case 'A':
				System.out.println("Excellent");
				break;
			case 'B':
				System.out.println("Very Good");
				break;
			case 'C':
				System.out.println("Good");
				break;
			case 'D':
				System.out.println("Fair");
				break;
			case 'E':
				System.out.println("Poor");
				break;
			default:
				System.err.println("letter error: Unknown character `" + C + "'");
				System.exit(1);
		}
	}
}
