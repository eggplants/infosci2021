/**
 * kadai mid-01
 *
 * @author haruna wataru
 * @version 2021-06-01
 */
class IsPrime
{
	static boolean isPrime(int n){
		if (n < 2) {
			return false;
		}

		int m = (int)Math.round(Math.sqrt(n));

		for (int i = 2; i <= m; i++) {
			if (n % i == 0) return false;
		}
		return true;
	}
	public static void main(String args[]){
        if (args.length != 1) {
			System.err.println("Wrong Arguments");
			System.exit(1);
		}
		int N = Integer.parseInt(args[0]);
		System.out.println(N + " is " + (isPrime(N) ? "" : "not ") + "prime");
	}
}
