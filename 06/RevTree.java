/**
 * kadai 06-ex1
 *
 * @author haruna wataru
 * @version 2021-05-25
 */
class RevTree
{
	public static void main(String args[]){
		if (args.length != 1) {
			System.err.println("Invalid argument");
			System.exit(1);
		}
		int N = Integer.parseInt(args[0]);
		for (int i = N - 1; 0 <= i; i--){
			System.out.println(
				" ".repeat(N - i - 1)+"*".repeat(i * 2 + 1)
			);
		}
	}
}
