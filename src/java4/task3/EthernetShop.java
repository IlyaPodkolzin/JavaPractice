package java4.task3;

import java.util.Scanner;

public class EthernetShop {

    private static int[] fruits_amount = new int[8];
    private static int[] vegetables_amount = new int[7];
    private static int[] berry_amount = new int[5];

    public static void session() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("����� ���������� � ��������-�������! ����� ��������� ���������� ����� � �������.");
        String login, password;
        Authorisations authorisations;

        do {
            System.out.print("========================\n�����: ");
            login = scanner.nextLine();
            System.out.print("������: ");
            password = scanner.nextLine();

        } while (!authorisation(login, password));

        authorisations = Authorisations.valueOf(login);
        System.out.println("\n�� ������� ����� ��� ������� " + authorisations);
        System.out.println();

        int currentStep = 0;
        int answer = 0;
        Catalogue currentCatalogue = Catalogue.BERRY;

        while (currentStep != 4) {
            switch (currentStep) {
                case 0:
                    System.out.println("�������� �������:");
                    showCatalogues();
                    do {
                        answer = scanner.nextInt();
                    }
                    while (answer < 1 || answer > 3);

                    if (answer == 1) currentCatalogue = Catalogue.FRUITS;
                    else if (answer == 2) currentCatalogue = Catalogue.VEGETABLES;
                    else currentCatalogue = Catalogue.BERRY;

                    currentStep++;
                    break;

                case 1:
                    System.out.println("�������� �������:");
                    showProducts(currentCatalogue);
                    System.out.println("!!! -1 - ��������� �������");
                    System.out.println("!!! 9 - ������� � �������");
                    do {
                        answer = scanner.nextInt();
                    }
                    while (answer != -1 && (answer < 1 || answer > 9));

                    if (answer == -1) currentStep--;
                    else if (answer != 9) chooseProducts(currentCatalogue, answer);
                    else currentStep++;
                    break;

                case 2:
                    showChosen(fruits_amount, vegetables_amount, berry_amount);
                    System.out.println("\n!!! -1 - ��������� �������");
                    System.out.println("!!!  1 - ��������");

                    do {
                        answer = scanner.nextInt();
                    }
                    while (answer != -1 && answer != 1);

                    if (answer == -1) currentStep--;
                    else currentStep++;
                    break;

                case 3:
                    System.out.println("��������! ������� �� �������!");
                    currentStep++;
                    break;

                default:
                    break;
            }
        }
    }

    private static boolean authorisation(String login, String password) {
        try {
            Authorisations authorisations = Authorisations.valueOf(login);
            if (authorisations.checkIfCorrect(password))
                return true;
            else {
                System.out.println("�������� ������! ���������� ��� ���.\n");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("����� �� ������ � ���� ������! ���������� ��� ���.\n");
        }
        return false;
    }

    private static void showCatalogues() {
        int i = 1;
        for (Catalogue catalogue: Catalogue.values()) {
            System.out.println(i + " - " + catalogue.getName());
            i++;
        }
    }

    private static void showProducts(Catalogue catalogue) {
        switch (catalogue) {
            case FRUITS:
                System.out.println(Fruits.showFruits());
                break;
            case VEGETABLES:
                System.out.println(Vegetables.showVegetables());
                break;
            case BERRY:
                System.out.println(Berry.showBerry());
                break;
        }
    }

    private static void chooseProducts(Catalogue catalogue, int position) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("������� �� ������ ������?");
        int answer;
        do {
            answer = scanner.nextInt();
        } while (answer < 1);

        switch (catalogue) {
            case FRUITS:
                fruits_amount[position - 1] += answer;
                break;
            case VEGETABLES:
                vegetables_amount[position - 1] += answer;
                break;
            case BERRY:
                berry_amount[position - 1] += answer;
                break;
        }
    }

    private static void showChosen(int[] fruits_amount, int[] vegetables_amount, int[] berry_amount) {
        System.out.println("�������:\n");

        Fruits fruits;
        Vegetables vegetables;
        Berry berry;
        double final_cost = 0;

        for (int i = 0; i < 8; i++) {
            if (fruits_amount[i] != 0) {
                fruits = Fruits.selectFruit(i + 1);
                System.out.printf("%s - %d ���� ===== %.2f ������%n", fruits, fruits_amount[i],
                        fruits_amount[i] * fruits.getCost());
                final_cost += fruits_amount[i] * fruits.getCost();
            }
        }
        for (int i = 0; i < 7; i++) {
            if (vegetables_amount[i] != 0) {
                vegetables = Vegetables.selectVegetable(i + 1);
                System.out.printf("%s - %d ���� ===== %.2f ������%n", vegetables, vegetables_amount[i],
                        vegetables_amount[i] * vegetables.getCost());
                final_cost += vegetables_amount[i] * vegetables.getCost();
            }
        }
        for (int i = 0; i < 5; i++) {
            if (berry_amount[i] != 0) {
                berry = Berry.selectBerry(i + 1);
                System.out.printf("%s - %d ���� ===== %.2f ������%n", berry, berry_amount[i],
                        berry_amount[i] * berry.getCost());
                final_cost += berry_amount[i] * berry.getCost();
            }
        }
        System.out.printf("�����: %.2f ������%n", final_cost);
    }
}
