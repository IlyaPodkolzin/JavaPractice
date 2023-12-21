package java20.task4;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        MinMax<Integer> minMaxInt = new MinMax<>(List.of(1, 2, 3, 4, 55, 2, 1, 3, 53243, 0, -99, -101, 2));
        System.out.println("Max: " + minMaxInt.getMax().toString() + ", min: " + minMaxInt.getMin().toString());

        MinMax<Double> minMaxDouble = new MinMax<>(List.of(1.1, 2.5, 3.4, 4.32, 55.231, 2.312321, 1.1, 3.6, 53243.43, 0.0, -99.11, -101.11, 2.345));
        System.out.println("Max: " + minMaxDouble.getMax().toString() + ", min: " + minMaxDouble.getMin().toString());
        System.out.println();

        System.out.println(Calculator.sum(2.2, 8));
        System.out.println(Calculator.sub(2F, 8.99));
        System.out.println(Calculator.mul(2.200, 8F));
        System.out.println(Calculator.div(2.2F, 8));
    }
}
