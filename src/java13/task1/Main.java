package java13.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("������� ������: ");

        stringWork(scanner.nextLine());

    }

    private static void stringWork(String string) {
        System.out.println();
        System.out.println("������: " + string);
        System.out.println("��������� ������: " + string.charAt(string.length() - 1));
        System.out.println("������������� �� \"!!!\": " + string.endsWith("!!!"));
        System.out.println("���������� �� \"I like\": " + string.startsWith("I like"));
        System.out.println("�������� \"Java\": " + string.contains("Java"));
        if (string.contains("Java")) {
            System.out.println("��������� \"Java\": " + string.indexOf("Java"));
            System.out.println("\"Java\": " + string.substring(string.indexOf("Java"), string.indexOf("Java") + 4));
        }
        System.out.println("������ \"�\" �� \"�\": " + string.replaceAll("a", "o"));
        System.out.println("��������� �����: " + string.toUpperCase());
        System.out.println("�������� �����: " + string.toLowerCase());
    }
}
