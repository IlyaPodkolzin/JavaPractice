package java11;

import java.util.*;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Задание 1");
        ex1();
        System.out.println("Задание 2");
        ex2();
        System.out.println("Задание 3");
        ex3();
        System.out.println("Задание 4");
        ex4();
        System.out.println("Задание 5");
        ex5();
    }

    private static void ex1() {
        System.out.println("Фамилия: Морозов");
        // вывод дат
        System.out.println("Дата получения задания: " + new Date(12, Calendar.NOVEMBER, 4, 10, 40, 0));
        System.out.println("Дата проверки: " + new Date());
    }

    private static void ex2() {

        Date date = new Date();

        // введение даты
        System.out.print("Введите год: ");
        date.setYear(scanner.nextInt() - 1900);
        System.out.print("Введите номер месяца: ");
        date.setMonth(scanner.nextInt() - 1);
        System.out.print("Введите число: ");
        date.setDate(scanner.nextInt());

        date.setHours(new Date().getHours());
        date.setMinutes(new Date().getMinutes());
        date.setSeconds(new Date().getSeconds());

        // сравнение текущей и введённой
        switch (date.compareTo(new Date())) {
            case 1 -> System.out.println("Введённое больше!");
            case 0 -> System.out.println("Времена равны!");
            case -1 -> System.out.println("Текущее больше!");
        }
    }

    private static void ex3() {

        Date date = new Date();

        // введение даты
        System.out.print("Введите год рождения студента: ");
        date.setYear(scanner.nextInt() - 1900);
        System.out.print("Введите номер месяца: ");
        date.setMonth(scanner.nextInt() - 1);
        System.out.print("Введите число: ");
        date.setDate(scanner.nextInt());
        System.out.println();

        // выбор типа вывода
        System.out.println("Выберите тип вывода: ");
        System.out.println("1 - год");
        System.out.println("2 - день и месяц");
        System.out.println("3 - день, месяц и год");

        // вывод
        System.out.println(
                new Student(88, "Alex", "Grib", 2, "ИКБО-16-22", 100, date)
                        .toString(TimeType.values()[scanner.nextInt() - 1])
        );
    }

    private static void ex4() {

        Scanner scanner1 = new Scanner(System.in);

        // ввод
        System.out.println("Введите данные по формату:");
        System.out.println("Год номер_месяца число часы минуты");
        String[] enter = scanner1.nextLine().split(" ");

        // создание даты
        Date date = new Date(
                Integer.valueOf(enter[0]) - 1900,
                Integer.valueOf(enter[1]) - 1,
                Integer.valueOf(enter[2]),
                Integer.valueOf(enter[3]),
                Integer.valueOf(enter[4])
        );

        // создание календаря
        Calendar calendar = Calendar.getInstance();
        calendar.set(
                Integer.valueOf(enter[0]) - 1900,
                Integer.valueOf(enter[1]) - 1,
                Integer.valueOf(enter[2]),
                Integer.valueOf(enter[3]),
                Integer.valueOf(enter[4])
        );

        // вывод
        System.out.println("Date:");
        System.out.println(date);
        System.out.println("Calender:");
        System.out.println(calendar);
    }

    private static void ex5() {

        long start;
        long end;

        // создание списков
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // сравнение списков
        start = System.currentTimeMillis(); // время начала
        for (int i = 0; i < 1000000; i++) arrayList.add(i);
        end = System.currentTimeMillis(); // время конца
        System.out.println("Добавление в ArrayList в милисекундах: " + (end - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) linkedList.add(i);
        end = System.currentTimeMillis();
        System.out.println("Добавление в LinkedList в милисекундах: " + (end - start));
        System.out.println();

        start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) arrayList.add(i, i);
        end = System.currentTimeMillis();
        System.out.println("Вставка в ArrayList в милисекундах: " + (end - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) linkedList.add(i, i);
        end = System.currentTimeMillis();
        System.out.println("Вставка в LinkedList в милисекундах: " + (end - start));
        System.out.println();

        start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) arrayList.contains(i);
        end = System.currentTimeMillis();
        System.out.println("Поиск в ArrayList в милисекундах: " + (end - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) linkedList.contains(i);
        end = System.currentTimeMillis();
        System.out.println("Поиск в LinkedList в милисекундах: " + (end - start));
        System.out.println();

        start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) arrayList.remove(i);
        end = System.currentTimeMillis();
        System.out.println("Удаление из ArrayList в милисекундах: " + (end - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) linkedList.remove(i);
        end = System.currentTimeMillis();
        System.out.println("Удаление из LinkedList в милисекундах: " + (end - start));
    }
}
