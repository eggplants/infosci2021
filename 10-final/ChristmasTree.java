/**
 * kadai 10-ex1
 *
 * @author haruna wataru
 * @version 2021-06-29
 */
class ChristmasTree {
    private static void drawTree(int h) {
        for (int i = 1; i <= h; i++) {
            System.out.println(" ".repeat(h - i) + "*".repeat(2 * i - 1));
        }
    }

    public static void main(String args[]) {
        if (args.length != 1) {
            System.err.println("Wrong Arguments");
            System.exit(1);
        }
        int Height = Integer.parseInt(args[0]);
        drawTree(Height);
    }
}
