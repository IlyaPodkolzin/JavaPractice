package java2.part3;

public class Circle {
    private Point centerPoint;

    public Circle(Point centerPoint) {
        this.centerPoint = centerPoint;
    }

    public Circle(double centerX, double centerY) {
        centerPoint = new Point(centerX, centerY);
    }

    public void setCenterPoint(Point centerPoint) {
        this.centerPoint = centerPoint;
    }

    public Point getCenterPoint() {
        return centerPoint;
    }

    public void setCenterPointCoordinates(double centerX, double centerY) {
        centerPoint.setX(centerX);
        centerPoint.setY(centerY);
    }

    public double getCenterPointX() {
        return centerPoint.getX();
    }

    public double getCenterPointY() {
        return centerPoint.getY();
    }
}
