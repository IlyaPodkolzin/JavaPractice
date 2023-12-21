package java3.company;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        double[] randomNums1 = new double[10];
        double[] randomNums2 = new double[10];

        Random random = new Random();

        for (int i = 0; i < 10; i++)
        {
            randomNums1[i] = random.nextDouble();
            randomNums2[i] = Math.random();
        }

        System.out.println("Using class Random: " + Arrays.toString(randomNums1));
        System.out.println("Using method Math.random: " + Arrays.toString(randomNums2));

        System.out.println("=================Sorting...=================");
        Arrays.sort(randomNums1);
        Arrays.sort(randomNums2);

        System.out.println("Using class Random: " + Arrays.toString(randomNums1));
        System.out.println("Using method Math.random: " + Arrays.toString(randomNums2));
    }
}
