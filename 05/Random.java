/**
 * kadai 05-ex2
 *
 * @author haruna wataru
 * @version 2021-05-24
 */
class Random
{
	public static void main(String args[]){
        	if (args.length != 1) {
			System.err.println("Wrong Arguments");
			System.exit(1);
		}
		double N = Double.parseDouble(args[0]);
		System.out.println("Input number		: " + N);
		System.out.println("Calculated number	: " + (N * Math.random()));
	}
}
