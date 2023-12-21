package java8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a, b;

        // ����� ����� �� A �� B
        System.out.println("������� 1");
        System.out.print("�� �����: ");
        a = scanner.nextInt();
        System.out.print("�� �����: ");
        b = scanner.nextInt();
        printNumbers(a, b);

        // ����� ����� � ������ ������ ����
        System.out.println("������� 2");
        System.out.print("���-�� ����: ");
        a = scanner.nextInt();
        System.out.print("������� �����: ");
        b = scanner.nextInt();
        System.out.println(howMuchNumber((int) Math.pow(10, a - 1), b, a) + " �����");

        // ����� ����� ����
        System.out.println("������� 3");
        System.out.print("�����: ");
        a = scanner.nextInt();
        System.out.println("����� ����: " + numsSum(a));

        // �������� �� ��������
        System.out.println("������� 4");
        System.out.print("�����: ");
        a = scanner.nextInt();
        if (isEasy(a, a - 1)) System.out.println("��� �������!");
        else System.out.println("�� �������...");

    }

    // ������� 1
    private static void printNumbers(int a, int b) {
        System.out.println(a);
        if (a < b)
            printNumbers(a + 1, b);
        else if (a > b)
            printNumbers(a - 1, b);
    }

    // ������� 2
    private static int howMuchNumber(int k, int d, int size) {
        if (k == Math.pow(10, size)) return 0;
        if (numsSum(k) == d) return 1 + howMuchNumber(k + 1, d, size);
        return howMuchNumber(k + 1, d, size);
    }

    // ������� 2
    private static int numsSum(int x) {
        if (x == 0) return 0;
        return x % 10 + numsSum(x / 10);
    }

    // ������� 3
    private static boolean isEasy(int x, int del) {
        if (del <= 1) return true;
        else if (x % del == 0) return false;
        return isEasy(x, del - 1);
    }
}

