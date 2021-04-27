/**
 * kadai 03-05
 *
 * @author haruna wataru
 * @version 2021-04-27
 */
class Area
{
    public static void main(String arg[]){
        float pi = (float)3.14;
        float width = 0;
        float height = 0;
        if (arg.length == 2) {
            width = Float.parseFloat(arg[0]);
            height = Float.parseFloat(arg[1]);
        } else {
            System.err.println("$ java Area <int W> <int H>");
            System.exit(1);
        }
        System.out.println("Input Width		: " + width);
        System.out.println("Input Height		: " + height);
        System.out.println("Triangle area		: " + (width * height) / (float)2.0);
        System.out.println("Square area		: " + width * height);
        System.out.println("Circle area		: " + (width * width * pi));

    }
}
