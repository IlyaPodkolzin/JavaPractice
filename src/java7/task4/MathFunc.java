package java7.task4;

// реализация интерфейса
public class MathFunc implements MathCalculable {
    @Override
    public int pow(int x, int pow) {
        return (int) Math.pow(x, pow);
    }

    @Override
    public double complexModule(int a, int b) {
        return Math.sqrt(a * a + b * b);
    }

    public double circleLen(int radius) {
        return 2 * PI * radius;
    }

    public double circleSquare(int radius) {
        return pow(radius, 2) * PI;
    }
}
