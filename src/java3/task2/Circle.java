package java3.task2;

public class Circle {
    Point center;
    double radius;

    public Circle() {
        this.center = new Point();
    }

    public Circle(Point center) {
        this.center = center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public void setCenter(double x, double y) {
        center = new Point(x, y);
    }

    public void setCenter(double xy) {
        center = new Point(xy, xy);
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "{" +
                center +
                ", " + radius +
                '}';
    }
}
