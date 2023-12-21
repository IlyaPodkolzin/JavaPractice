package java3.task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("======1=====");

        double littleDouble = 31.54;
        Double bigDouble = Double.valueOf(littleDouble);
        Double bigDouble2 = Double.valueOf("43.11");
        System.out.println(bigDouble);
        System.out.println(bigDouble2);

        System.out.println("============");



        System.out.println();



        System.out.println("======2=====");

        Scanner scanner = new Scanner(System.in);
        System.out.println("¬ведите Double: ");
        String string = scanner.nextLine();
        System.out.println("Double: " + Double.parseDouble(string));

        System.out.println("============");



        System.out.println();



        System.out.println("======3=====");

        Double douuble = 43.133;
        System.out.println("Double itself: " + douuble);
        System.out.println("Double to byte: " + douuble.byteValue() );
        System.out.println("Double to short: " + douuble.shortValue() );
        System.out.println("Double to int: " + douuble.intValue() );
        System.out.println("Double to long: " + douuble.longValue() );
        System.out.println("Double to float: " + douuble.floatValue() );
        System.out.println("Double to double: " + douuble.doubleValue() );

        System.out.println("============");



        System.out.println();



        System.out.println("======4=====");

        Double douuble2 = 244.1345;
        System.out.println("Value of Double: " + douuble2.doubleValue());

        System.out.println("============");



        System.out.println();



        System.out.println("======5=====");

        String d = Double.toString(3.14);
        System.out.println("Double to String: " + d);

        System.out.println("============");
    }
}
