package java2.part4;

import java.util.Scanner;

public class Test {

    private static Shop shop = new Shop();

    public static void main(String[] args) {

        String company, model;

        System.out.println("����� ��������� ���������� �������� ����������. ������� ����� ������ ������������� � ������." +
                " ����� ����� - 0:");

        Scanner scanner = new Scanner(System.in);
        company = scanner.next();

        while (!company.equals("0")) {
            model = scanner.next();
            shop.addComputer(new Computer(company, model));
            company = scanner.next();
        }

        System.out.println("----------------------------------------------------------------------------------------" +
                "----------------------------");
        System.out.println("----------------------------------------------------------------------------------------" +
                "----------------------------");
        System.out.println();

        System.out.println("����� ���������� � ������������ �������! ������� �������� ������������ ����������," +
                "� �� �������� ��� �������. ��� ������ ������� 0.");
        company = scanner.next();

        while (!company.equals("0")) {
            model = scanner.next();

            if (shop.searchComputer(company, model)) {
                System.out.println("��������� ������� � �������! ���������� �� �������!");
                shop.deleteComputer(company, model);
            } else
                System.out.println("� ���������, ������� ���������� ��� � �������.");
            company = scanner.next();
        }
    }
}
