package java6.task2;

// движимый прямоугольник
public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    // проверка скоростей двух точек
    public boolean speedTest() {
        return topLeft.xSpeed == bottomRight.xSpeed & topLeft.ySpeed == bottomRight.ySpeed;
    }

    @Override
    public void moveUp() {}

    @Override
    public void moveDown() {}

    @Override
    public void moveLeft() {}

    @Override
    public void moveRight() {}
}
