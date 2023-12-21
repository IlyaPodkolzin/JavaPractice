package java13.task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите номер телефона: ");
        PhoneNumber phoneNumber = new PhoneNumber(scanner.nextLine());

        System.out.println(phoneNumber);
    }
}
