package java2.part1;

import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args) {

        String name;
        String email;
        char gender;

        Scanner sc = new Scanner(System.in);
        System.out.println("������� ��� ������:");
        name = sc.next();

        System.out.println("������� ����������� ����� ������:");
        email = sc.next();

        System.out.println("������� ��� ������:");
        gender = (char) sc.next().charAt(0);

        Author author = new Author(name, email, gender);
        System.out.println("������ �� ������:");
        System.out.println(author.toString());

        System.out.println();
        System.out.println("���:" + author.getName());
        System.out.println("�����:" + author.getEmail());
        System.out.println("���:" + author.getGender());

        System.out.println("������� ����� �����:");
        email = sc.next();
        author.setEmail(email);
        System.out.println("����� �����: " + author.getEmail());
    }
}
