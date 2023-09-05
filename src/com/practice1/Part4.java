package com.practice1;

public class Part4 {
    public static void main(String[] args) {

        System.out.println("Гармонический ряд:");
        for (short i = 1; i < 11; i++)
        {
            System.out.print("N" + i + " = 1/" + i + " = ");
            System.out.printf("%.3f", 1.0f / i);
            System.out.println();
        }
    }
}
