package java3.task6;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("========1=======");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество долларов для конвертации в евро: ");
        Double us = scanner.nextDouble();

        NumberFormat numberFormatUS = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat numberFormatEU = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println(numberFormatUS.format(us) + " -> " + numberFormatEU.format(Converter.DollarToEuro(us)));


        System.out.println("Введите количество евро для конвертации в доллары: ");
        Double eu = scanner.nextDouble();

        System.out.println(numberFormatEU.format(eu) + " -> " + numberFormatUS.format(Converter.EuroToDollar(eu)));

        System.out.println("================");



        System.out.println("========2=======");

        Shop.startWorking();
        System.out.println("Сумма заказа составила " + numberFormatUS.format(Shop.getPrice()));

        System.out.println("Какой валютой вы хотите расплатиться?");
        System.out.println("us - доллары");
        System.out.println("eu - евро");
        String answer = scanner.next();
        Shop.setCurrency(answer);

        double money_amount = -1;
        while (true) {
            System.out.println("Введите количество денег, которое хотите отдать:");
            money_amount = scanner.nextDouble();
            if (Shop.requestMoney(money_amount)) {
                System.out.println("Спасибо за покупку! С учётом курса выбранной валюты ("
                        + Shop.getCurrency() + "), полученная сумма составила "
                        + numberFormatUS.format(Shop.getConvertedRequestedMoney(money_amount))
                        + "  Ваша сдача составила " + numberFormatUS.format(Shop.getChange()));
                break;
            }
            else {
                System.out.println("Недостаточно средств! С учётом курса выбранной валюты ("
                        + Shop.getCurrency() + "), полученная сумма составила "
                        + numberFormatUS.format(Shop.getConvertedRequestedMoney(money_amount))
                        + ". Пожалуйста, попробуйте еще раз.");
            }
        }

        System.out.println("================");



        System.out.println("========3=======");

        System.out.println("Введите количество сотрудников: ");
        int employee_amount = scanner.nextInt();
        Report.setEmployees(employee_amount);
        System.out.println(Report.generateReport());

        System.out.println("================");
    }
}
