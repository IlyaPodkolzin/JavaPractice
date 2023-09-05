package com.practice2.part2;

import com.practice2.part1.Author;

import java.util.Scanner;

public class TestBall {
    public static void main(String[] args) {

        double x = 0.0;
        double y = 0.0;

        Ball ball = new Ball();

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите координаты мяча:");
        System.out.print("X = ");
        x = sc.nextDouble();
        ball.setX(x);

        System.out.print("Y = ");
        y = sc.nextDouble();
        ball.setY(y);

        System.out.println("Данные о мяче:");
        System.out.println(ball.toString());


        System.out.println("Введите координаты второго мяча:");
        System.out.print("X = ");
        x = sc.nextDouble();

        System.out.print("Y = ");
        y = sc.nextDouble();

        Ball ball1 = new Ball(x, y);

        System.out.println("Данные о втором мяче:");
        System.out.println(ball1.toString());


        System.out.println("Введите координаты третьего мяча:");
        System.out.print("X = ");
        x = sc.nextDouble();

        System.out.print("Y = ");
        y = sc.nextDouble();

        Ball ball2 = new Ball();
        ball2.setXY(x, y);

        System.out.println("Данные о третьем мяче:");
        System.out.println("X = " + ball2.getX());
        System.out.println("Y = " + ball2.getY());

        System.out.println("Введите расстояние по координатам, на которое нужно подвинуть третий мяч:");
        System.out.print("X = ");
        x = sc.nextDouble();

        System.out.print("Y = ");
        y = sc.nextDouble();

        ball2.move(x, y);
        System.out.println("Данные о третьем мяче:");
        System.out.println(ball2.toString());
    }
}
