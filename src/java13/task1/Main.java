package java13.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");

        stringWork(scanner.nextLine());

    }

    private static void stringWork(String string) {
        System.out.println();
        System.out.println("Строка: " + string);
        System.out.println("Последний символ: " + string.charAt(string.length() - 1));
        System.out.println("Заканчивается на \"!!!\": " + string.endsWith("!!!"));
        System.out.println("Начинается на \"I like\": " + string.startsWith("I like"));
        System.out.println("Содержит \"Java\": " + string.contains("Java"));
        if (string.contains("Java")) {
            System.out.println("Положение \"Java\": " + string.indexOf("Java"));
            System.out.println("\"Java\": " + string.substring(string.indexOf("Java"), string.indexOf("Java") + 4));
        }
        System.out.println("Замена \"а\" на \"о\": " + string.replaceAll("a", "o"));
        System.out.println("Заглавные буквы: " + string.toUpperCase());
        System.out.println("Строчные буквы: " + string.toLowerCase());
    }
}
