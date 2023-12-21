package java9.task2;

import java.util.Comparator;

// класс для сравнения элементов
public class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.gpa - o2.gpa;
    }
}
