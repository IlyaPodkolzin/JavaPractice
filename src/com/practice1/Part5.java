package com.practice1;

public class Part5 {

    public static void main(String[] args) {
        for (int j = 0; j < 11; j++) {
            System.out.println(j + "! = " + factorial(j));
        }
    }

    private static long factorial(int number) {
        long result = 1;
        for (int i = 2; i <= number; i++)
            result *= i;

        return result;
    }
}
