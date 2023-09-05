package com.practice2.part1;

import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args) {

        String name;
        String email;
        char gender;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя автора:");
        name = sc.next();

        System.out.println("Введите электронную почту автора:");
        email = sc.next();

        System.out.println("Введите пол автора:");
        gender = (char) sc.next().charAt(0);

        Author author = new Author(name, email, gender);
        System.out.println("Данные об авторе:");
        System.out.println(author.toString());

        System.out.println();
        System.out.println("Имя:" + author.getName());
        System.out.println("Почта:" + author.getEmail());
        System.out.println("Пол:" + author.getGender());

        System.out.println("Введите новую почту:");
        email = sc.next();
        author.setEmail(email);
        System.out.println("Новая почта: " + author.getEmail());
    }
}
