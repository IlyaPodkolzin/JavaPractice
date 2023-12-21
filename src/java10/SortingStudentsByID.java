package java10;

import java.util.Comparator;

// сравнение по ID
public class SortingStudentsByID implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getId() - o2.getId();
    }
}
