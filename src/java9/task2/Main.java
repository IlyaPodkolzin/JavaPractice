package java9.task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // массив
        List<Student> students = new ArrayList<>(List.of(new Student[]{
                new Student(234, "Илья", 67),
                new Student(2, "Денис", 74),
                new Student(100, "Артем", 70),
                new Student(24, "Александр", 54),
                new Student(25, "Влад", 89)
        }));

        // сортировка через созданный класс
        Comparator<Student> sortingStudentsByGPA = new SortingStudentsByGPA();
        students.sort(sortingStudentsByGPA);
        for (Student student : students) System.out.println(student);
    }
}
