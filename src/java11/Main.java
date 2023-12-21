package java11;

import java.util.*;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("������� 1");
        ex1();
        System.out.println("������� 2");
        ex2();
        System.out.println("������� 3");
        ex3();
        System.out.println("������� 4");
        ex4();
        System.out.println("������� 5");
        ex5();
    }

    private static void ex1() {
        System.out.println("�������: �������");
        // ����� ���
        System.out.println("���� ��������� �������: " + new Date(12, Calendar.NOVEMBER, 4, 10, 40, 0));
        System.out.println("���� ��������: " + new Date());
    }

    private static void ex2() {

        Date date = new Date();

        // �������� ����
        System.out.print("������� ���: ");
        date.setYear(scanner.nextInt() - 1900);
        System.out.print("������� ����� ������: ");
        date.setMonth(scanner.nextInt() - 1);
        System.out.print("������� �����: ");
        date.setDate(scanner.nextInt());

        date.setHours(new Date().getHours());
        date.setMinutes(new Date().getMinutes());
        date.setSeconds(new Date().getSeconds());

        // ��������� ������� � ��������
        switch (date.compareTo(new Date())) {
            case 1 -> System.out.println("�������� ������!");
            case 0 -> System.out.println("������� �����!");
            case -1 -> System.out.println("������� ������!");
        }
    }

    private static void ex3() {

        Date date = new Date();

        // �������� ����
        System.out.print("������� ��� �������� ��������: ");
        date.setYear(scanner.nextInt() - 1900);
        System.out.print("������� ����� ������: ");
        date.setMonth(scanner.nextInt() - 1);
        System.out.print("������� �����: ");
        date.setDate(scanner.nextInt());
        System.out.println();

        // ����� ���� ������
        System.out.println("�������� ��� ������: ");
        System.out.println("1 - ���");
        System.out.println("2 - ���� � �����");
        System.out.println("3 - ����, ����� � ���");

        // �����
        System.out.println(
                new Student(88, "Alex", "Grib", 2, "����-16-22", 100, date)
                        .toString(TimeType.values()[scanner.nextInt() - 1])
        );
    }

    private static void ex4() {

        Scanner scanner1 = new Scanner(System.in);

        // ����
        System.out.println("������� ������ �� �������:");
        System.out.println("��� �����_������ ����� ���� ������");
        String[] enter = scanner1.nextLine().split(" ");

        // �������� ����
        Date date = new Date(
                Integer.valueOf(enter[0]) - 1900,
                Integer.valueOf(enter[1]) - 1,
                Integer.valueOf(enter[2]),
                Integer.valueOf(enter[3]),
                Integer.valueOf(enter[4])
        );

        // �������� ���������
        Calendar calendar = Calendar.getInstance();
        calendar.set(
                Integer.valueOf(enter[0]) - 1900,
                Integer.valueOf(enter[1]) - 1,
                Integer.valueOf(enter[2]),
                Integer.valueOf(enter[3]),
                Integer.valueOf(enter[4])
        );

        // �����
        System.out.println("Date:");
        System.out.println(date);
        System.out.println("Calender:");
        System.out.println(calendar);
    }

    private static void ex5() {

        long start;
        long end;

        // �������� �������
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // ��������� �������
        start = System.currentTimeMillis(); // ����� ������
        for (int i = 0; i < 1000000; i++) arrayList.add(i);
        end = System.currentTimeMillis(); // ����� �����
        System.out.println("���������� � ArrayList � ������������: " + (end - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) linkedList.add(i);
        end = System.currentTimeMillis();
        System.out.println("���������� � LinkedList � ������������: " + (end - start));
        System.out.println();

        start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) arrayList.add(i, i);
        end = System.currentTimeMillis();
        System.out.println("������� � ArrayList � ������������: " + (end - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) linkedList.add(i, i);
        end = System.currentTimeMillis();
        System.out.println("������� � LinkedList � ������������: " + (end - start));
        System.out.println();

        start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) arrayList.contains(i);
        end = System.currentTimeMillis();
        System.out.println("����� � ArrayList � ������������: " + (end - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) linkedList.contains(i);
        end = System.currentTimeMillis();
        System.out.println("����� � LinkedList � ������������: " + (end - start));
        System.out.println();

        start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) arrayList.remove(i);
        end = System.currentTimeMillis();
        System.out.println("�������� �� ArrayList � ������������: " + (end - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) linkedList.remove(i);
        end = System.currentTimeMillis();
        System.out.println("�������� �� LinkedList � ������������: " + (end - start));
    }
}
