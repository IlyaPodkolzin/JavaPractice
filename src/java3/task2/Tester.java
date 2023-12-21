package java3.task2;

import java.util.Arrays;
import java.util.Random;

public class Tester {
    Circle[] circles;
    int circles_amount;

    public Tester() {
        this.circles = new Circle[0];
        this.circles_amount = 0;
    }

    public Tester(Circle[] circles, int circles_amount) {
        this.circles = circles;
        this.circles_amount = circles_amount;
    }

    public Circle maxCircle() {
        double maxRadius = 0;
        int result_i = 0;
        for (int i = 0; i < circles_amount; i++) {
            if (circles[i].getRadius() > maxRadius) {
                maxRadius = circles[i].getRadius();
                result_i = i;
            }
        }
        return circles[result_i];
    }

    public Circle minCircle() {
        if (circles_amount == 0) return null;
        double minRadius = circles[0].radius;
        int result_i = 0;
        for (int i = 0; i < circles_amount; i++) {
            if (circles[i].getRadius() < minRadius) {
                minRadius = circles[i].getRadius();
                result_i = i;
            }
        }
        return circles[result_i];
    }

    public void sortArray() {
        for (int i = 0; i < circles_amount - 1; i++) {
            double minRad = circles[i].radius;
            int min_i = i;
            for (int j = i + 1; j < circles_amount; j++) {
                if (circles[j].radius < minRad) {
                    min_i = j;
                    minRad = circles[j].radius;
                }
            }
            Circle someCircle = circles[i];
            circles[i] = circles[min_i];
            circles[min_i] = someCircle;
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(circles);
    }

    public void generateCircles(int circlesAmount) {
        circles_amount = circlesAmount;
        circles = new Circle[circlesAmount];
        Random random = new Random();
        for (int i = 0; i < circles_amount; i++) {
            circles[i] = new Circle(new Point(Math.random(), random.nextDouble()));
            circles[i].setRadius(random.nextDouble() * 50);
        }
    }
}
