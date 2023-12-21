package java2.part6;

public class Circle {

    private double radius = 0.0;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getLength() {
        return 2 * Math.PI * radius;
    }

    public int compare(Circle circle2) {
        return Double.compare(radius, circle2.radius);
    }
}
