package java4_1.company;

public class Rectangle extends Shape {

    protected double width, length;

    public Rectangle() {
        width = 0;
        length = 0;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String getType() {
        return "Прямоугольник";
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "Прямоугольник: {" +
                "ширина = " + width +
                ", длина = " + length +
                '}';
    }
}
