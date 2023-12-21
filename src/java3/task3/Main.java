package java3.task3;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] mass = {10 + random.nextInt(89),
                10 + random.nextInt( 89),
                10 + random.nextInt( 89),
                10 + random.nextInt( 89)};

        System.out.println(Arrays.toString(mass));

        boolean flag = true;
        for (int i = 1; i < mass.length; i++) {
            if (mass[i] <= mass[i-1]) {
                flag = false;
                break;
            }
        }

        if (flag) System.out.println("Массив строго возрастает.");
        else System.out.println("Массив НЕ строго возрастает.");
    }
}
