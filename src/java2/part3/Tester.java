package java2.part3;

import java.util.Scanner;

public class Tester {
    static private final Circle[] circles = new Circle[10];
    private int circlesAmount;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pointX, pointY;
        System.out.println("������� ���������� ������ �����:");
        System.out.print("X = ");
        pointX = scanner.nextDouble();
        System.out.print("Y = ");
        pointY = scanner.nextDouble();

        Point point = new Point(pointX, pointY);


        System.out.println("������� ���������� ������ �����:");
        System.out.print("X = ");
        pointX = scanner.nextDouble();
        System.out.print("Y = ");
        pointY = scanner.nextDouble();

        Point point2 = new Point(0, 0);
        point2.setX(pointX);
        point2.setY(pointY);

        circles[0] = new Circle(point);
        System.out.println("������� ����� ���� ��������� ������ �����. ������ � �����:");
        System.out.println("�����: " + circles[0].getCenterPoint());
        System.out.println("X = " + circles[0].getCenterPointX());
        System.out.println("Y = " + circles[0].getCenterPointY());

        circles[0].setCenterPoint(point2);
        System.out.println("������� ����� ���� ��������� ������ �����. ������ � �����:");
        System.out.println("�����: " + circles[0].getCenterPoint());
        System.out.println("X = " + circles[0].getCenterPointX());
        System.out.println("Y = " + circles[0].getCenterPointY());

        System.out.println("������� ����� ���������� ������ ������ ����������:");
        System.out.print("X = ");
        pointX = scanner.nextDouble();
        System.out.print("Y = ");
        pointY = scanner.nextDouble();

        circles[0].setCenterPointCoordinates(pointX, pointY);
        System.out.println("������ � �����:");
        System.out.println("�����: " + circles[0].getCenterPoint());
        System.out.println("X = " + circles[0].getCenterPointX());
        System.out.println("Y = " + circles[0].getCenterPointY());

        System.out.println("������� ���������� ������ ������ ����������:");
        System.out.print("X = ");
        pointX = scanner.nextDouble();
        System.out.print("Y = ");
        pointY = scanner.nextDouble();

        circles[1] = new Circle(pointX, pointY);
        System.out.println("������ � �����:");
        System.out.println("�����: " + circles[1].getCenterPoint());
        System.out.println("X = " + circles[1].getCenterPointX());
        System.out.println("Y = " + circles[1].getCenterPointY());
    }
}
