/**
 * kadai 06-ex2
 *
 * @author haruna wataru
 * @version 2021-05-25
 */
import java.util.*;

class PerfectNum
{
	public static void main(String args[]){
		int N;

		if (args.length != 1) {
			N = 50;
		} else {
			N = Integer.parseInt(args[0]);
		}

		List<Integer> l = new ArrayList<Integer>();

		for (int i = 1; l.size() != N; i++){
			if (divSum(i) == i) {
				System.out.println(i);
				l.add(i);
			}
		}
	}
	static int divSum(int num) {
		int result = 0;
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				if (i == (num / i)) {
					result += i;
				} else {
					result += (i + num / i);
				}
			}
		}
		return (result + 1);
	}
}
