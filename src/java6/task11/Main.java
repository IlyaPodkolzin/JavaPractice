package java6.task11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("������� ���-�� �������� �������: ");
        Temperature temperature = new Temperature(scanner.nextDouble());
        System.out.println();

        // ������������ ��������
        System.out.println(temperature.convert(TemperatureCategory.KELVIN) + " � ���������");
        System.out.println(temperature.convert(TemperatureCategory.FAHRENHEIT) + " � �����������");
    }
}
