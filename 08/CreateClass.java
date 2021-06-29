
/**
 * kadai 08-02
 *
 * @author haruna wataru
 * @version 2021-06-10
 */

import java.util.Arrays;

class Disp {
	void display(Object... args) {
		if (args.length < 1) {
			System.out.println("No argument");
		} else {
			System.out.println(Arrays.toString(args).replace("[", "").replace("]", ""));
		}
	}
}

class CreateClass {
	public static void main(String args[]) {
		Disp obj = new Disp();

		obj.display();
		obj.display("Hello");
		obj.display("Hi", 100);
	}
}
