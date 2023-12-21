package java1;

import java.util.Scanner;

public class Part2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите количество чисел:");
        while (!sc.hasNextInt())
        {
            System.out.println("Неверные данные. Попробуйте ещё раз.");
            sc.next();
        }
        int[] numbers = new int[Math.abs(sc.nextInt())];
        System.out.println("Введите " + numbers.length + " целых чисел:");

        short i = 0;
        while (i < numbers.length) {
            if (sc.hasNextInt()) {
                numbers[i] = sc.nextInt();
                i++;
            }
            else sc.next();
        }

        i = 0;

        int minimum = numbers.length > 0? numbers[0]:0;
        int maximum = numbers.length > 0? numbers[0]:0;
        int summary = 0;

        if (numbers.length > 0)
            do {
                summary += numbers[i];
                if (minimum > numbers[i]) minimum = numbers[i];
                if (maximum < numbers[i]) maximum = numbers[i];
                i++;
            } while (i < numbers.length);

        System.out.println();
        System.out.println("Сумма: " + summary);
        System.out.println("Минимальное: " + minimum);
        System.out.println("Максимальное: " + maximum);
    }
}
