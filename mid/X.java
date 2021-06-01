/**
 * kadai mid-02
 *
 * @author haruna wataru
 * @version 2021-06-01
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class X
{
	static void evenCross(int n) {
		List<String> cross = new ArrayList<>();
		for (int i = 0; i < n/2; i++) {
			cross.add(
				" ".repeat(i) +
				"X" +
				" ".repeat(n - 2 * (i+1)) +
				"X"
			);
		}
		System.out.println(String.join("\n", cross));
		Collections.reverse(cross);
		System.out.println(String.join("\n", cross));
	}
	static void oddCross(int n) {
		List<String> cross = new ArrayList<>();
		int i = 0;
		for (; i < n/2; i++) {
			cross.add(
				" ".repeat(i) +
				"X" +
				" ".repeat(n - 2 * (i+1)) +
				"X"
			);
		}
		System.out.println(String.join("\n", cross));
		System.out.println(" ".repeat(i) + "X");
		Collections.reverse(cross);
		System.out.println(String.join("\n", cross));
	}
	public static void main(String args[]){
        if (args.length != 1) {
			System.err.println("Wrong Arguments");
			System.exit(1);
		}
		int N = Integer.parseInt(args[0]);
		if (N < 3) {
			System.err.println("Argument int must be 3 or more");
			System.err.println("Got	: " + N);
			System.exit(1);
		}
		if (N % 2 == 0) {
			evenCross(N);
		} else {
			oddCross(N);
		}
	}
}
