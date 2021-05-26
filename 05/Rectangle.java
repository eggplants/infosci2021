/**
 * kadai 05-ex1
 *
 * @author haruna wataru
 * @version 2021-05-24
 */
class Rectangle
{
	private static void drawRect(int w, int h){
		for (int i = 0; i < h; i++) {
			System.out.println("#".repeat(w));
		}
	}
	public static void main(String args[]){
        	if (args.length != 2) {
			System.err.println("Wrong Arguments");
			System.exit(1);
		}
		int W = Integer.parseInt(args[0]);
		int H = Integer.parseInt(args[1]);
		drawRect(W, H);
	}
}
