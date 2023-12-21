package java2.part6;

import java.util.Scanner;

public class CircleTest {

    public static void main(String[] args) {
        double radius;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите радиус двух окружностей:");
        System.out.print("R1 = ");
        radius = scanner.nextDouble();
        Circle circle1 = new Circle();
        circle1.setRadius(radius);

        System.out.print("R2 = ");
        radius = scanner.nextDouble();
        Circle circle2 = new Circle();
        circle2.setRadius(radius);

        System.out.println();
        System.out.println("Данные об окружностях:");
        System.out.println("R1 = " + circle1.getRadius());
        System.out.println("S1 = " + circle1.getArea());
        System.out.println("L1 = " + circle1.getLength());
        System.out.println();
        System.out.println("R2 = " + circle2.getRadius());
        System.out.println("S2 = " + circle2.getArea());
        System.out.println("L2 = " + circle2.getLength());
        System.out.println();
        if (circle1.compare(circle2) == 1) System.out.println("Первая окружность больше второй.");
        else if (circle1.compare(circle2) == 0) System.out.println("Первая окружность равна второй.");
        else System.out.println("Первая окружность меньше второй.");
    }
}
