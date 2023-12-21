package java6.task10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {

        ArrayList<Computer> computers = new ArrayList<>(List.of(new Computer[]{
                new Computer(
                        ComputerBrand.ARDOR,
                        new Processor(10, 16, 2.5),
                        new Memory(1000, 3350, 2800),
                        new VideoCard(1920, 12, 504)
                ),
                new Computer(
                        ComputerBrand.MSI,
                        new Processor(6, 12, 2.5),
                        new Memory(500, 3600, 2300),
                        new VideoCard(1552, 8, 224)
                ),
                new Computer(
                        ComputerBrand.DEXP,
                        new Processor(4, 8, 3.7),
                        new Memory(500, 3500, 2100),
                        new VideoCard(1485, 4, 192)
                )
        }));

        int enter;
        Scanner scanner = new Scanner(System.in);
        Processor processor;
        Memory memory;
        VideoCard videoCard;
        while (true) {
            System.out.println("�������� ��������:");
            System.out.println("0 - �����");
            System.out.println("1 - �������� ���������");
            System.out.println("2 - ������� ���������");
            System.out.println("3 - ��� ����������");
            System.out.println("4 - ����� ���������");
            enter = scanner.nextInt();
            switch (enter) {
                case 0 -> {

                    // �����
                    System.out.println("����� �� ��������");
                    return;

                }
                case 1 -> computers.add(new Computer(scanner)); // �������� ��

                case 2 -> {

                    // ������� ��
                    System.out.print("������� ����� ���������� ����������: ");
                    enter = scanner.nextInt();
                    computers.remove(enter);
                    System.out.println("�����");

                }
                case 3 -> printComputers(computers); // ����� �����������

                case 4 -> {

                    // ����� �� �� ���������������
                    System.out.println("������� ����������� �������������� ��:");
                    processor = new Processor(scanner);
                    memory = new Memory(scanner);
                    videoCard = new VideoCard(scanner);
                    System.out.println();

                    for (int i = 0; i < computers.size(); i++) {
                        if (computers.get(i).getProcessor().compareTo(processor) &
                                computers.get(i).getMemory().compareTo(memory) &
                                computers.get(i).getVideoCard().compareTo(videoCard)) {
                            System.out.println("���������� ��:");
                            System.out.println(i + "\n" + computers.get(i).toString() + '\n');
                        }
                    }

                }
                default -> System.out.println("������");
            }
            System.out.println();
        }
    }

    // ������ �����������
    private static void printComputers(ArrayList<Computer> computers) {
        System.out.println("����������:");
        for (int i = 0; i < computers.size(); i++) System.out.println(i + "\n" + computers.get(i).toString() + '\n');
    }
}
