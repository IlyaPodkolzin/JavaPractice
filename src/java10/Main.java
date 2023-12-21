package java10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // до сортировок
        System.out.println("До:");
        List<Student> students = setArray();
        outArray(students);
        System.out.println();

        // сортировка по GPA
        System.out.println("По GPA:");
        Comparator<Student> sortingStudentsByGPA = new SortingStudentsByGPA();
        students.sort(sortingStudentsByGPA);
        outArray(students);
        System.out.println();

        // сортировка по ID
        System.out.println("По ID:");
        students = setArray();
        Comparator<Student> sortingStudentsById = new SortingStudentsByID();
        students.sort(sortingStudentsById);
        outArray(students);
    }

    // создание массива
    static private List<Student> setArray() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Артем", "Мальцев", 2, "ДВГУПС-13-666", 150));
        students.add(new Student(6, "Илья", "Морозов", 2, "ИКБО-16-22", 88));
        students.add(new Student(15, "Владислав", "Куликов", 2, "ИКБО-16-22", 80));
        students.add(new Student(4, "NoName", "NoSurName", 4, "ИКБО-NO-20", 10));
        students.add(new Student(2, "Александр", "Грибков", 2, "ИКБО-16-22", 74));
        return students;
    }

    // вывод массива
    static private void outArray(List<Student> students) {
        for (Student student : students) System.out.println(student);
    }
}
