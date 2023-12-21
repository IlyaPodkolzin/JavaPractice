package java4_1.company;

abstract public class Shape {
    protected String color;
    protected boolean filled;

    public Shape() {
        color = "undefined";
        filled = false;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public boolean isFilled() {
        return filled;
    }

    abstract public String getType();
    abstract public double getArea();
    abstract public double getPerimeter();
}
