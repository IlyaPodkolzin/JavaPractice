package java2.part8;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Количество слов: " + scanner.nextLine().split(" +").length);
    }
}
