/**
 * kadai 10-ex4
 *
 * @author haruna wataru
 * @version 2021-06-29
 */
class Rectangle {
    int width;
    int height;

    Rectangle() {
        setSize(0, 0);
    }

    Rectangle(int width, int height) {
        setSize(width, height);
    }

    void setSize(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public String toString() {
        return "[" + width + "," + height + "]";
    }
}
