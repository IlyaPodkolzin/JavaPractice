package java1;
import java.lang.*;
import java.util.Scanner;

public class Part1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("������� ���������� �����:");
        while (!sc.hasNextInt())
        {
            System.out.println("�������� ������. ���������� ��� ���.");
            sc.next();
        }
        int[] numbers = new int[Math.abs(sc.nextInt())];
        System.out.println("������� " + numbers.length + " ����� �����:");

        short i = 0;
        while (i < numbers.length) {
            if (sc.hasNextInt()) {
                numbers[i] = sc.nextInt();
                i++;
            }
            else sc.next();
        }

        int summary = 0;
        float average= 0f;

        for (i = 0; i < numbers.length; i++)
        {
            summary += numbers[i];
        }

        if (numbers.length != 0)
            average = summary * 1.0f / numbers.length;

        System.out.println();
        System.out.println("�����: " + summary);
        System.out.println("������� ��������������: " + average);
    }
}
