package java3.task6;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("========1=======");

        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ���������� �������� ��� ����������� � ����: ");
        Double us = scanner.nextDouble();

        NumberFormat numberFormatUS = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat numberFormatEU = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println(numberFormatUS.format(us) + " -> " + numberFormatEU.format(Converter.DollarToEuro(us)));


        System.out.println("������� ���������� ���� ��� ����������� � �������: ");
        Double eu = scanner.nextDouble();

        System.out.println(numberFormatEU.format(eu) + " -> " + numberFormatUS.format(Converter.EuroToDollar(eu)));

        System.out.println("================");



        System.out.println("========2=======");

        Shop.startWorking();
        System.out.println("����� ������ ��������� " + numberFormatUS.format(Shop.getPrice()));

        System.out.println("����� ������� �� ������ ������������?");
        System.out.println("us - �������");
        System.out.println("eu - ����");
        String answer = scanner.next();
        Shop.setCurrency(answer);

        double money_amount = -1;
        while (true) {
            System.out.println("������� ���������� �����, ������� ������ ������:");
            money_amount = scanner.nextDouble();
            if (Shop.requestMoney(money_amount)) {
                System.out.println("������� �� �������! � ������ ����� ��������� ������ ("
                        + Shop.getCurrency() + "), ���������� ����� ��������� "
                        + numberFormatUS.format(Shop.getConvertedRequestedMoney(money_amount))
                        + "  ���� ����� ��������� " + numberFormatUS.format(Shop.getChange()));
                break;
            }
            else {
                System.out.println("������������ �������! � ������ ����� ��������� ������ ("
                        + Shop.getCurrency() + "), ���������� ����� ��������� "
                        + numberFormatUS.format(Shop.getConvertedRequestedMoney(money_amount))
                        + ". ����������, ���������� ��� ���.");
            }
        }

        System.out.println("================");



        System.out.println("========3=======");

        System.out.println("������� ���������� �����������: ");
        int employee_amount = scanner.nextInt();
        Report.setEmployees(employee_amount);
        System.out.println(Report.generateReport());

        System.out.println("================");
    }
}
