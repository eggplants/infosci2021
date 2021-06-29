
/**
 * kadai 10-ex2
 *
 * @author haruna wataru
 * @version 2021-06-29
 */

import java.util.Arrays;
import java.util.Scanner;

class CoinCase {
	int[] num = new int[6];
	int[] sorts = { 500, 100, 50, 10, 5, 1 };

	CoinCase() {
		Arrays.fill(num, 0);
	}

	private int indexOf(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key)
				return i;
		}
		return -1;
	}

	void addCoins(int sort, int count) {
		int sortIndex = indexOf(sorts, sort);
		if (sortIndex > -1)
			this.num[sortIndex] += count;
	}

	int getCount(int sort) {
		int sortIndex = indexOf(sorts, sort);
		if (sortIndex > -1)
			return this.num[sortIndex];
		return 0;
	}

	int getAmount() {
		int sum = 0;
		for (int i = 0; i < 6; i++) {
			sum += num[i] * sorts[i];
		}
		return sum;
	}
}

class Coins {
	public static void main(String args[]) {
		CoinCase obj = new CoinCase();
		Scanner scanner = new Scanner(System.in);
		for (int i = 1; i < 11; i++) {
			System.out.println("Attempt:		" + i);
			System.out.print("Input Coin's sort>	");
			int s = scanner.nextInt();
			System.out.print("Input Coin's count>	");
			int c = scanner.nextInt();
			obj.addCoins(s, c);
			System.out.println("Coins>			" + Arrays.toString(obj.num));
			System.out.println("=".repeat(50));
		}
		System.out.println("Sum:	" + obj.getAmount() + "yen");
		System.out.print("(");
		for (int i = 0; i < 5; i++) {
			System.out.printf("%dy: %d, ", obj.sorts[i], obj.num[i]);
		}
		System.out.printf("%dy: %d.)\n", obj.sorts[5], obj.num[5]);

	}
}
