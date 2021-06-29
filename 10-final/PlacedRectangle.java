/**
 * kadai 10-ex4
 *
 * @author haruna wataru
 * @version 2021-06-29
 */
class PlacedRectangle extends Rectangle {
    int x, y;

    PlacedRectangle() {
        super();
    }

    PlacedRectangle(int x, int y) {
        super();
        setPlace(x, y);
    }

    PlacedRectangle(int x, int y, int width, int height) {
        setParams(x, y, width, height);
    }

    void setParams(int x, int y, int width, int height) {
        setPlace(x, y);
        setSize(width, height);
    }

    void setPlace(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return String.format("[(%d, %d) [%d, %d]]", x, y, width, height);
    }
}