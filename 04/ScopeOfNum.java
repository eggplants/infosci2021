/**
 * kadai 04-04
 *
 * @author haruna wataru
 * @version 2021-05-13
 */
class ScopeOfNum
{
	private static void p(String s)	{
		System.out.println(s);
	}
	private static void pe(String s) {
		System.err.println(s);
	}
	public static void main(String args[]){
        	if (args.length != 1) {
			pe("Argument must be one!");
			System.exit(1);
		}
		int N = Integer.parseInt(args[0]);

		p("Input Number	: " + N);
		if (N == 6) {
			p("6 is OK");
		} else {
			p(N + " is NG");
		}
    	}
}
