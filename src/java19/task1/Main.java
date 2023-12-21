package java19.task1;

import java.util.Scanner;

public class Main {
    private static final String[] INN = {
            "1222 1245 0000 9000",
            "0000 0990 0060 0001",
            "0000 2000 3222 0008",
            "1111 0000 6664 0000",
            "0060 0880 8888 0020",
            "0034 0880 0660 0600"
    };

    public static void main(String[] args) throws INNNotFoundException {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ФИО: ");
        String name = scanner.nextLine();

        System.out.print("Введите ИНН: ");
        String inn = scanner.nextLine();

        boolean find = false;
        for (String num : INN) if (num.equals(inn)) find = true;
        if (!find) throw new INNNotFoundException("ИНН не найден!");

        System.out.println("Оплата пройдена!");
    }
}
