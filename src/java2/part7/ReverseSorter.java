package java2.part7;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseSorter {

    public static void main(String[] args) {
        String[] mass = new String[10];
        Scanner scanner = new Scanner(System.in);
        System.out.print("������� 10 ����: ");
        for (int j = 0; j < 10; j++)
            mass[j] = scanner.next();
        String element;

        System.out.println("������� ������: " + Arrays.toString(mass));
        for (int i = 0; i < 5; i++) {
            element = mass[i];
            mass[i] = mass[9 - i];
            mass[9 - i] = element;
        }
        System.out.println("������ � �������� �������: " + Arrays.toString(mass));
    }
}
