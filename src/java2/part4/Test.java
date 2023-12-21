package java2.part4;

import java.util.Scanner;

public class Test {

    private static Shop shop = new Shop();

    public static void main(String[] args) {

        String company, model;

        System.out.println("Перед открытием необходимо закупить компьютеры. Введите через пробел производителя и модель." +
                " Конец ввода - 0:");

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

        System.out.println("Добро пожаловать в компьютерный магазин! Введите название необходимого компьютера," +
                "и мы проверим его наличие. Для выхода введите 0.");
        company = scanner.next();

        while (!company.equals("0")) {
            model = scanner.next();

            if (shop.searchComputer(company, model)) {
                System.out.println("Компьютер имеется в наличии! Благодарим за покупку!");
                shop.deleteComputer(company, model);
            } else
                System.out.println("К сожалению, данного компьютера нет в наличии.");
            company = scanner.next();
        }
    }
}
