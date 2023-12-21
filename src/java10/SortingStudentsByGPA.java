package java10;

import java.util.Comparator;

// сравнение по GPA
public class SortingStudentsByGPA implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o2.getGpa() - o1.getGpa();
    }
}
