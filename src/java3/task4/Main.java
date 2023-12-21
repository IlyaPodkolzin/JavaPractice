package java3.task4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int answer = 0;
        while (answer <= 0) {
            System.out.print("¬ведите размер массива: ");
            answer = scanner.nextInt();
        }

        Random random = new Random();

        int counter = 0;
        int[] mass = new int[answer];
        for (int i = 0; i < answer; i++) {
            mass[i] = random.nextInt(answer);
            if (mass[i] % 2 == 0) counter++;
        }

        int counter2 = 0;
        int[] mass_even = new int[counter];
        for (int i = 0; i < answer; i++) {
            if (mass[i] % 2 == 0)
            {
                mass_even[counter2] = mass[i];
                counter2++;
            }
        }

        System.out.println("Array: " + Arrays.toString(mass));
        System.out.println("Even Array: " + Arrays.toString(mass_even));
    }
}
