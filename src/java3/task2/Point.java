package java3.task2;

public class Point {
    private double x;
    private double y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(double xy) {
        this.x = xy;
        this.y = xy;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x +
                ", " + y +
                ')';
    }
}
