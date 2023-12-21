package java14;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        ex1();
        System.out.println("Задание 2");
        ex2();
        System.out.println("Задание 3");
        ex3();
        System.out.println("Задание 5");
        ex5();
        System.out.println("Задание 8");
        ex8();
        System.out.println("Задание 9");
        ex9();
    }

    private static void ex1() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String enter = scanner.nextLine();

        System.out.print("Разделитель: ");
        String div = scanner.nextLine();

        System.out.println();
        for (String s : enter.split(div))
            System.out.println(s);
    }

    private static void ex2() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String enter = scanner.nextLine();

        if (enter.equals("abcdefghijklmnopqrstuv18340"))
            System.out.println("Это строка \"abcdefghijklmnopqrstuv18340\"!");
        else
            System.out.println("Это строка не \"abcdefghijklmnopqrstuv18340\"!");
    }

    private static void ex3() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String enter = scanner.nextLine();

        String currency;
        int j;
        for (int i = 0; i < enter.length() - 1; i++) {

            if (i != enter.length() - 2) {
                currency = enter.substring(i, i + 3);
                if ((currency.equals("USD") | currency.equals("RUB")) & i > 1) {
                    j = i - 2;
                    while ((int) enter.charAt(j) >= 48 && (int) enter.charAt(j) <= 57 || (int) enter.charAt(j) == 46) {
                        j--;
                        if (j < 0) break;
                    }
                    System.out.println(enter.substring(j + 1, i + 3));
                }
            }
            currency = enter.substring(i, i + 2);
            if (currency.equals("EU") & i > 1) {
                j = i - 2;
                while ((int) enter.charAt(j) >= 48 && (int) enter.charAt(j) <= 57 || (int) enter.charAt(j) == 46) {
                    j--;
                    if (j < 0) break;
                }
                System.out.println(enter.substring(j + 1, i + 2));
            }
        }
    }

    private static void ex5() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String enter = scanner.nextLine();

        if (checkDate(enter))
            System.out.println("Это дата!");
        else
            System.out.println("Это не дата!");
    }

    private static boolean checkDate(String date) {
        if (date.length() != 10) return false;
        if (date.split("/").length != 3) return false;
        if (date.split("/")[0].length() != 2 |
                date.split("/")[1].length() != 2 |
                date.split("/")[2].length() != 4) return false;

        for (char ch : date.toCharArray()) {
            if (!((int) ch >= 48 & (int) ch <= 57 | (int) ch == 47))
                return false;
        }

        int day = Integer.parseInt(date.split("/")[0]);
        int month = Integer.parseInt(date.split("/")[1]);
        int year = Integer.parseInt(date.split("/")[2]);

        if (year < 1900) return false;
        if (day > 31 | day == 0) return false;
        if (month > 12 | month == 0) return false;

        switch (month) {
            case 4, 6, 9, 11:
                if (day == 31) return false;
            case 2:
                if (day > 29) return false;
                if (year % 4 != 0)
                    if (day == 29) return false;
        }
        return true;
    }

    private static void ex8() {

        ArrayList<String> list = new ArrayList<>();

        list.add("Каждый охотник");
        list.add("желает знать");
        list.add("как сварить фазана");
        list.add(null);
        list.add(null);
        list.add("тесттесттест");
        list.add(null);
        list.add("123334");
        list.add("555442");

        printList(list);
        System.out.println();
        ArrayList<String> ans = filter(list, new Filter() {
            @Override
            public boolean apply(Object object) {
                return object != null;
            }
        });

        printList(ans);
    }

    private static <T> ArrayList<T> filter(ArrayList<T> objects, Filter filter) {
        ArrayList<T> result = new ArrayList<>();
        for (T object : objects) {
            if (filter.apply(object))
                result.add(object);
        }
        return result;
    }

    private static void printList(ArrayList<String> list) {
        for (String string : list)
            System.out.println(Objects.requireNonNullElse(string, "Отсутствует"));
    }

    private static void ex9() {

        char start_letter = 'а';
        char end_letter = 'я';

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String s = scanner.nextLine();

        int[] frequency = new int[(int)end_letter - (int)start_letter + 1];
        for (char c : s.toLowerCase().toCharArray())
            if ((int) c >= (int)start_letter && (int) c <= (int)end_letter)
                frequency[c - (int)start_letter]++;

        for (int i = 0; i < frequency.length; i++)
            System.out.println((char) ((int)start_letter + i) + ": " + frequency[i]);
    }
}

interface Filter {
    boolean apply(Object object);
}
